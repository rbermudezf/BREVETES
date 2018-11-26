package pe.mil.ejercito.ms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.mil.ejercito.ms.dao.MenuPvoDAO;
import pe.mil.ejercito.ms.model.MenuPvo;


@Repository
@Transactional

public class MenuPvoDAOImpl  implements MenuPvoDAO{

	@Override
	public List<MenuPvo> ListaMenu() {
		List<MenuPvo> ListaMenuPvo=new ArrayList<>();
		
		return null;
	}

}
