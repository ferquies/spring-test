package com.ferquies.dao;

import java.util.List;

import com.ferquies.domain.Perro;
import com.ferquies.utils.ComboOption;

public interface PerroDao {
	
	public void insertPerro(Perro perro);
	public void updatePerro(Perro perro);
	public List<Perro> getPerrosByNombre(String nombre);
	public List<Perro> getPerrosWhere(Perro perro);
	public Perro getPerroById(int id);
	public List<Perro> getAllPerros();
	public List<Perro> getAllPerrosList();
	public List<ComboOption> getAdoptadoCombo();
	public void deletePerro(int id);

}
