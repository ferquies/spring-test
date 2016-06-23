package com.ferquies.domain;

public class Perro {
	
	private int id;
	private String nombre;
	private String raza;
	private String sexo;
	private String color;
	private String tamano;
	private String edad;
	private String foto;
	private String adoptado;
	
	public Perro() {}
	
	/**
	 * @param id
	 * @param nombre
	 * @param raza
	 * @param color
	 * @param tamano
	 * @param edad
	 * @param foto
	 * @param adoptado
	 */
	public Perro(int id, String nombre, String raza, String color, String tamano, String edad, String foto, String adoptado) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.edad = edad;
		this.foto = foto;
		this.adoptado = adoptado;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
	
	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the tamano
	 */
	public String getTamano() {
		return tamano;
	}
	
	/**
	 * @param tamano the tamano to set
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}
	
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}
	
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	/**
	 * @return the adoptado
	 */
	public String getAdoptado() {
		return adoptado;
	}
	
	/**
	 * @param adoptado the adoptado to set
	 */
	public void setAdoptado(String adoptado) {
		this.adoptado = adoptado;
	}

}
