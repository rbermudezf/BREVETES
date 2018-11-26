package pe.mil.ejercito.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.model.MenuPvo;

@Repository
public interface MenuPvoDAO {

	public List<MenuPvo> ListaMenu();
	
}
