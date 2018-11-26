package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity//LLAMA A LA ENTIDAD
@Table(name="EP_DEPENDENCIA")//LLAMA A LA ATBLA
public class Dependencia {
	
	@Id //TOMA A LA LLAVE PRIMARIA
	@GeneratedValue(generator="sq_dependencia")//GENERAR TU CODIGO YA SEA POR UNA SECUENCIA O EL JAVA
	@SequenceGenerator(name="sq_dependencia",sequenceName="\"SQ_DEPENDENCIA\"", allocationSize=1) 
	@Column( name="CDEPENDENCIA_CODIGO")
	private String dependenciaCodigo;

	private String VDEPENDENCIA_NOMBRE;
	private Integer VDEPENDENCIA_ABREVIADO;
	private String CDEPENDENCIA_PREFIJO;
	
	public String getDependenciaCodigo(){
		return dependenciaCodigo;
	}

	public void setDependenciaCodigo(String dependenciaCodigo){
		this.dependenciaCodigo = dependenciaCodigo;
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
