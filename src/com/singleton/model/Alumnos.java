package com.singleton.model;

public class Alumnos {
	
	private int idAlumno;
	private String nombreAlumno;
	
	private static Alumnos miUnicaInstanciadeAlumnos=null;
	
	public static Alumnos getInstanceofAlumnos()
	{	
		if(miUnicaInstanciadeAlumnos==null)
		{
			miUnicaInstanciadeAlumnos=new Alumnos();
		}
		else
		{
			throw new RuntimeException("Exception ocurred in creating Singleton instance");
		}
		return miUnicaInstanciadeAlumnos;
	}
	
	private Alumnos()
	{
		
	}

	private Alumnos(int idAlumno, String nombreAlumno) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
	}	
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	

}
