/*
 * MIT License 
 * 
 * Copyright (c) 2018 ADA
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * Kotan is a Japanese word.
 * The literal meaning of this word is 'elegant simplicity'.
 * You have to admire a culture that actually has its own word mean
 * for this type of concept.
 *
 */

package org.ada.use.caxe;

/**
 *
 * <h1>Profesion</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN  (ADA)
 * @version 1.0
 * 
 */
public class Profesion implements RegistroActivo{
	private String nombre;
	private String nivel;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Profesion(String nombre, String nivel) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
	}
	
	@Override
	public void registro() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		System.out.println("Registro comportamiento");
		
	}
	@Override
	public void consultar() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		
	}
	@Override
	public void actualizar() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		System.out.println("Consulto comportamiento");
	}
	@Override
	public void dibujar() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		System.out.println("Dibujo comportamiento");
	}
	@Override
	public void errores() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		System.out.println("errores comportamiento");
	}
	@Override
	public void excepciones() {
			/*
			 * =======================
			 * Declaracion de varibles 
			 * =======================
			*/
		
		
			//Inicio logica
		System.out.println("excepciones comportamiento");
	}
	
	

}

