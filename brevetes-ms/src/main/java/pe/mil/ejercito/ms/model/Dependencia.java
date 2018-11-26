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
	private String DependenciaCodigo;

	@Column( name="VDEPENDENCIA_NOMBRE")
	private String DependenciaNombre;
	
	@Column( name="VDEPENDENCIA_ABREVIADO")
	private Integer DependenciaAbreviado;
	
	@Column( name="CDEPENDENCIA_PREFIJO")
	private String DependenciaPrefijo;
	
	public String getDependenciaCodigo() {
		return DependenciaCodigo;
	}

	public void setDependenciaCodigo(String dependenciaCodigo) {
		DependenciaCodigo = dependenciaCodigo;
	}

	public String getDependenciaNombre() {
		return DependenciaNombre;
	}

	public void setDependenciaNombre(String dependenciaNombre) {
		DependenciaNombre = dependenciaNombre;
	}

	public Integer getDependenciaAbreviado() {
		return DependenciaAbreviado;
	}

	public void setDependenciaAbreviado(Integer dependenciaAbreviado) {
		DependenciaAbreviado = dependenciaAbreviado;
	}

	public String getDependenciaPrefijo() {
		return DependenciaPrefijo;
	}

	public void setDependenciaPrefijo(String dependenciaPrefijo) {
		DependenciaPrefijo = dependenciaPrefijo;
	}

	

}
