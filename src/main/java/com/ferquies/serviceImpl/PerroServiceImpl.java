package com.ferquies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ferquies.dao.PerroDao;
import com.ferquies.domain.Perro;
import com.ferquies.service.PerroService;
import com.ferquies.utils.Combo;

@Service("perroService")
public class PerroServiceImpl implements PerroService {
	
	@Autowired
	private PerroDao dao;
	
	@Transactional
	public void insertPerro(Perro perro) {
		dao.insertPerro(perro);
	}
	
	@Transactional
	public void updatePerro(Perro perro) {
		dao.updatePerro(perro);
	}
	
	public List<Perro> getPerrosByNombre(String nombre) {
		return dao.getPerrosByNombre(nombre);
	}
	
	public List<Perro> getPerrosWhere(Perro perro) {
		return dao.getPerrosWhere(perro);
	}
	
	public Perro getPerroById(int id) {
		return dao.getPerroById(id);
	}
	
	public List<Perro> getAllPerros() {
		return dao.getAllPerros();
	}
	
	public List<Perro> getAllPerrosList() {
		return dao.getAllPerrosList();
	}
	
	public Combo getAdoptadoCombo() {
		return new Combo(dao.getAdoptadoCombo());
	}
	
	public void deletePerro(int id) {
		dao.deletePerro(id);
	}

}
