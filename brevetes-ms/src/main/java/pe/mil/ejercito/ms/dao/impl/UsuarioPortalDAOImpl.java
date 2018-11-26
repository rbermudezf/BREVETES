package pe.mil.ejercito.ms.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.dao.UsuarioPortalDAO;
import pe.mil.ejercito.ms.model.Usuario;

@Repository
public class UsuarioPortalDAOImpl extends BaseDAOImpl<Usuario> implements UsuarioPortalDAO{

	public UsuarioPortalDAOImpl(){
		super(Usuario.class);
	}
	
}
