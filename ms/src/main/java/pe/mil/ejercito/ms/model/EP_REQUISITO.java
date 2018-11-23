package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_REQUISITO")

public class EP_REQUISITO {

    //Son anotaciones 
	//ID es el primary key
	//Hace una secuencia de la tabla SQ_REQUISITO
	//
	@Id
	@GeneratedValue(generator="SQ_REQUISITO")
	@SequenceGenerator(name="SQ_REQUISITO",sequenceName="SQ_REQUISITO", allocationSize=1)
	
	private int CREQUISITO_CODIGO;
	private String VREQUISITO_NOMBRE;
	
	
	public int getCREQUISITO_CODIGO() {
		return CREQUISITO_CODIGO;
	}
	public void setCREQUISITO_CODIGO(int cREQUISITO_CODIGO) {
		CREQUISITO_CODIGO = cREQUISITO_CODIGO;
	}
	public String getVREQUISITO_NOMBRE() {
		return VREQUISITO_NOMBRE;
	}
	public void setVREQUISITO_NOMBRE(String vREQUISITO_NOMBRE) {
		VREQUISITO_NOMBRE = vREQUISITO_NOMBRE;
	}
	
	
	

}
