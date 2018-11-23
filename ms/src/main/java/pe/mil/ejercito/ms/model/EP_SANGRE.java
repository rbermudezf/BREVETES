package pe.mil.ejercito.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EP_SANGRE")
public class EP_SANGRE {

	@Id
	//ESTARATEGIA DARLE VALOR AL ID(o puedes poner, asociado a la secuencia)
	@GeneratedValue(generator="sq_sangre")
	//amarrado a la BD
	@SequenceGenerator(name="sq_sangre",sequenceName="\"SQ_SANGRE\"", allocationSize=1)
	private Long id;
	
	private String VSANGRE_COD;
	private String VSANGRE_DESLAR;
	private Integer VSANGRE_DESCOR;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVSANGRE_COD() {
		return VSANGRE_COD;
	}
	public void setVSANGRE_COD(String vSANGRE_COD) {
		VSANGRE_COD = vSANGRE_COD;
	}
	public String getVSANGRE_DESLAR() {
		return VSANGRE_DESLAR;
	}
	public void setVSANGRE_DESLAR(String vSANGRE_DESLAR) {
		VSANGRE_DESLAR = vSANGRE_DESLAR;
	}
	public Integer getVSANGRE_DESCOR() {
		return VSANGRE_DESCOR;
	}
	public void setVSANGRE_DESCOR(Integer vSANGRE_DESCOR) {
		VSANGRE_DESCOR = vSANGRE_DESCOR;
	}
	
	
		
}
