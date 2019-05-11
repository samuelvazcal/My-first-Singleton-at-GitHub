package com.singleton.main;

import com.singleton.model.Alumnos;

public class AppAlumnos {

	@SuppressWarnings("static-access")
	public static void main(String [] args)
	{
		//forma1 inicializacion en dos pasos
		//Alumnos alumno1=null;
		//alumno1.getInstanceofAlumnos();
		Alumnos alumno1 = Alumnos.getInstanceofAlumnos();
		alumno1.setIdAlumno(7);
		alumno1.setNombreAlumno("Samuel");
		System.out.println("Id: "+alumno1.getIdAlumno()+" Nombre: "+alumno1.getNombreAlumno());
		
		Alumnos alumno2 = Alumnos.getInstanceofAlumnos();
		alumno2.setIdAlumno(7);
		alumno2.setNombreAlumno("Samuel");
		System.out.println("Id: "+alumno2.getIdAlumno()+" Nombre: "+alumno2.getNombreAlumno());
		
		//forma2 inicializacion en una linea
		//Alumnos alumno = Alumnos.getInstanceofAlumnos();
		
		//forma3 instanciacion de la clase utilizando el metodo estatico
		//Alumnos.getInstanceofAlumnos();
		
	}
}
