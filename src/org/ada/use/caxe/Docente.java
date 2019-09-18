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
 * <h1>Docente</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN  (ADA)
 * @version 1.0
 * 
 */
public class Docente extends Usuario{

	private Profesion profesion;
	private String nivel;
	
	public Docente(String nombre, String apellido, String documento) {
		super(nombre, apellido, documento);
		// TODO Auto-generated constructor stub
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	/**
	 * Description
	 * JavaDoc
	*/
	public Float evaluar(Date dia, Float fecha) {
		Evaluacion evalua = new Evaluacion (dia,fecha);
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		System.out.println("Evaluando el docente");
		return evalua.evaluar();
	}

}
