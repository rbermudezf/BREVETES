package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_ROL_PVU")


public class EP_MENU_PVU {
	@Id
	@GeneratedValue(generator="sq_menu")
	@SequenceGenerator(name="sq_menu",sequenceName="SQ_MENU", allocationSize=1)
	
	private String VMENU_CODIGO;
	private String VMENU_NOMBRE;
	
	public String getVMENU_CODIGO() {
		return VMENU_CODIGO;
	}
	public void setVMENU_CODIGO(String vMENU_CODIGO) {
		VMENU_CODIGO = vMENU_CODIGO;
	}
	public String getVMENU_NOMBRE() {
		return VMENU_NOMBRE;
	}
	public void setVMENU_NOMBRE(String vMENU_NOMBRE) {
		VMENU_NOMBRE = vMENU_NOMBRE;
	}
	
	
	
	
	

}
