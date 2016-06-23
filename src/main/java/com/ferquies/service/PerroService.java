package com.ferquies.service;

import java.util.List;

import com.ferquies.domain.Perro;
import com.ferquies.utils.Combo;

public interface PerroService {
	
	void insertPerro(Perro perro);
	void updatePerro(Perro perro);
	List<Perro> getPerrosByNombre(String nombre);
	List<Perro> getPerrosWhere(Perro perro);
	Perro getPerroById(int id);
	List<Perro> getAllPerros();
	List<Perro> getAllPerrosList();
	Combo getAdoptadoCombo();
	void deletePerro(int id);

}
