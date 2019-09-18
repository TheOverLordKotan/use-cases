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

import java.util.Date;

/**
 *
 * <h1>Evaluacion</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN  (ADA)
 * @version 1.0
 * 
 */
public class Evaluacion implements RegistroActivo{
	
	private Date fecha;
	private Float nota;
	
	
	public Evaluacion(Date fecha, Float nota) {
		super();
		this.fecha = fecha;
		this.nota = nota;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Float getNota() {
		return nota;
	}


	public void setNota(Float nota) {
		this.nota = nota;
	}


	/**
	 * Description
	 * JavaDoc
	*/
	public Float evaluar() {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		//Inicio logica
		System.out.println("evaluo" + " fecha "+ this.fecha + "nota" + this.nota);
		return nota;
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

