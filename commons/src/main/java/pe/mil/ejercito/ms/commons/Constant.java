package pe.mil.ejercito.ms.commons;


public class Constant {
	
	private Constant() {
		throw new IllegalStateException( ErrorMessages.CONSTANT_CLASS_NOT_INSTANCE.generateMessage("Constant") );
	}
	
	public static Integer NO_ERROR = 0;
	public static Integer HAS_ERROR = 1;
	
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";
	
	public static final String PROP_JDBC_DATASOURCE = "jdbc.datasource";
	public static final String PROP_JDBC_HIBERNATE_DIALECT = "jdbc.hibernate.dialect";
	public static final String PROP_JDBC_HIBERNATE_SHOWSQL = "jdbc.hibernate.showsql";
	
	public static final String PROP_REST_RESOURCE_EXCLUDE="rest.resource.exclude";
	public static final String PROP_REST_ENDPOINT="rest.endpoint";
	public static final String PROP_MSG_HTTP_ERR_NOAUT="msg.http.error.noautorizado";
	public static final String PROP_MSG_HTTP_ERR_SERV="msg.http.error.servidor";
	
	public static final String REST_HEADER_AUTHORIZATION = "Authorization";
	public static final int REST_RESPONSE_OK = 200;
	public static final int REST_RESPONSE_UNAUTHORIZATION = 401;
	
	
}
