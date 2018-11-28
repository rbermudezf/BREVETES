package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.MenuPvoDAO;
import pe.mil.ejercito.ms.model.MenuPvo;
import pe.mil.ejercito.ms.services.MenuPvoService;
@Service
public class MenuPvoServiceImpl implements MenuPvoService{

	@Autowired
	private MenuPvoDAO menuPvoDAO;
	
	@Override
	public List<MenuPvo> listarMenu() {
		// TODO Auto-generated method stub
		return menuPvoDAO.listarTodos();
	}

}
