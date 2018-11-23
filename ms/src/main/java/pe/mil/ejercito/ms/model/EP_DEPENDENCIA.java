package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity//LLAMA A LA ENTIDAD
@Table(name="EP_DEPENDENCIA")//LLAMA A LA ATBLA


public class EP_DEPENDENCIA {
	
	@Id //TOMA A LA LLAVE PRIMARIA
	@GeneratedValue(generator="sq_dependencia")//GENERAR TU CODIGO YA SEA POR UNA SECUENCIA O EL JAVA
	@SequenceGenerator(name="sq_dependencia",sequenceName="\"SQ_DEPENDENCIA\"", allocationSize=1) 
	
	private String CDEPENDENCIA_CODIGO;
	private String VDEPENDENCIA_NOMBRE;
	private Integer VDEPENDENCIA_ABREVIADO;
	private String CDEPENDENCIA_PREFIJO;
	
	
	public String getCDEPENDENCIA_CODIGO() {
		return CDEPENDENCIA_CODIGO;
	}
	public void setCDEPENDENCIA_CODIGO(String cDEPENDENCIA_CODIGO) {
		CDEPENDENCIA_CODIGO = cDEPENDENCIA_CODIGO;
	}
	public String getVDEPENDENCIA_NOMBRE() {
		return VDEPENDENCIA_NOMBRE;
	}
	public void setVDEPENDENCIA_NOMBRE(String vDEPENDENCIA_NOMBRE) {
		VDEPENDENCIA_NOMBRE = vDEPENDENCIA_NOMBRE;
	}
	public Integer getVDEPENDENCIA_ABREVIADO() {
		return VDEPENDENCIA_ABREVIADO;
	}
	public void setVDEPENDENCIA_ABREVIADO(Integer vDEPENDENCIA_ABREVIADO) {
		VDEPENDENCIA_ABREVIADO = vDEPENDENCIA_ABREVIADO;
	}
	public String getCDEPENDENCIA_PREFIJO() {
		return CDEPENDENCIA_PREFIJO;
	}
	public void setCDEPENDENCIA_PREFIJO(String cDEPENDENCIA_PREFIJO) {
		CDEPENDENCIA_PREFIJO = cDEPENDENCIA_PREFIJO;
	}
	
	
	
	

}
