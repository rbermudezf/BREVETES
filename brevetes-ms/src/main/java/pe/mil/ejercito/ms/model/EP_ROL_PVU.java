package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_ROL_PVU")
public class EP_ROL_PVU {
	
	@Id
	@GeneratedValue(generator="SQ_ROL")
	@SequenceGenerator(name="SQ_ROL",sequenceName="SQ_ROL", allocationSize=1)
	private String CROL_CODIGO;
	private String VROL_NOMBRE;
	private String VROL_PRIVILEGIO;
	
	public String getCROL_CODIGO() {
		return CROL_CODIGO;
	}
	public void setCROL_CODIGO(String cROL_CODIGO) {
		CROL_CODIGO = cROL_CODIGO;
	}
	public String getVROL_NOMBRE() {
		return VROL_NOMBRE;
	}
	public void setVROL_NOMBRE(String vROL_NOMBRE) {
		VROL_NOMBRE = vROL_NOMBRE;
	}
	public String getVROL_PRIVILEGIO() {
		return VROL_PRIVILEGIO;
	}
	public void setVROL_PRIVILEGIO(String vROL_PRIVILEGIO) {
		VROL_PRIVILEGIO = vROL_PRIVILEGIO;
	}
	
}
