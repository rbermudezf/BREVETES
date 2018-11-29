package pe.mil.ejercito.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EP_PARAMETRO")

public class Parametro{

@Column(name="VPAR_GRUPO")	
private String grupo;

@Column(name="VPAR_NOMBRE")	
private String nombre;

@Column(name="VPAR_ALIAS")	
private String alias;
  
@Column(name="NPAR_KEY")
private Long key;

@Column(name="VPAR_VALOR_TEXTO")
private String valorTexto;

@Column(name="NPAR_VALOR_NUMERO")
private Long ValorNumero;

@Column(name="CPAR_ESTADO")	
private String estado;

@Column(name="NPAR_KEY_PADRE")
private Long keyPadre;

}
