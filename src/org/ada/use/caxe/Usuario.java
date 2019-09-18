package org.ada.use.caxe;
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

/**
 *
 * <h1>Usuario</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN  (ADA)
 * @version 1.0
 * 
 */
public class Usuario  implements RegistroActivo{
	private String nombre;
	private String apellido;
	private String documento;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Usuario(String nombre, String apellido, String documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
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
