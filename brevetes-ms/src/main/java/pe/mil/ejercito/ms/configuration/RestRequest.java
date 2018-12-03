package pe.mil.ejercito.ms.configuration;

import static pe.mil.ejercito.ms.commons.Constant.HEADER_AUTHORIZACION_KEY;
import static pe.mil.ejercito.ms.commons.Constant.TOKEN_BEARER_PREFIX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class RestRequest implements Filter {
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Llamando a los servicios");
		
		String token = ((HttpServletRequest)request).getHeader(HEADER_AUTHORIZACION_KEY);
		String urlWeb = ((HttpServletRequest)request).getRequestURL().toString();
		System.out.println("Llamando a los servicios + " + token + " - " + urlWeb);
		
		if( urlWeb.contains("swagger-ui.html") || urlWeb.contains("webjars") || 
				urlWeb.contains("swagger-resources") || urlWeb.contains("v2") || 
				urlWeb.contains("configuration") ) {
			chain.doFilter(request, response);
			return;
		}
		
		if (token != null ) {

			try {
				// curl -X GET "https://www.googleapis.com/oauth2/v1/userinfo" -H"Authorization: Bearer ya29.GltnBvJv9jHoskBMPLUVcNylH5AOWtlUkNuxBzUyAHPLtdHEyq9uZDAUsgqCuNHmFOftA0ZK9ZuPlDbki9kzrdBV92uzzErIyVyxbZjyUP0iyODtnzqKxFuoczCV
				// https://any-api.com/googleapis_com/oauth2/console/userinfo/oauth2_userinfo_get
				
				URL url = new URL("https://www.googleapis.com/oauth2/v1/userinfo");

				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestProperty("authorization", token);
				con.connect();
				
				if (con.getResponseCode() != 200) {
			        throw new RuntimeException("Servicio de autenticación no está disponible: " + con.getResponseCode());
			    }
				
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuffer sb = new StringBuffer();
				String inputLine;

				while ((inputLine = br.readLine()) != null) {
					sb.append(inputLine);
				}

				System.out.println("Obtenido del servidor: " + sb.toString());
				
				br.close();
				con.disconnect();
				chain.doFilter(request, response);
				return;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			((HttpServletResponse)response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
					"Credenciales no son las correctas.");
			return;
		}

		((HttpServletResponse)response).sendError(HttpServletResponse.SC_UNAUTHORIZED,
				"No tiene permisos para acceder al recurso.");

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void destroy() {
		
	}
}
