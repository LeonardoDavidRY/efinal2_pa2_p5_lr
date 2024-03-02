package com.uce.edu.repository.modelo.dto;

public class MatriculaDTO {
	
	private String cedulaEstudiante;
	private String codigoMateria;
	private String cedulaProfesor;
	private String nombreHilo;

	public MatriculaDTO() {
		super();
	}

	public MatriculaDTO(String cedulaEstudiante, String codigoMateria, String cedulaProfesor, String nombreHilo) {
		super();
		this.cedulaEstudiante = cedulaEstudiante;
		this.codigoMateria = codigoMateria;
		this.cedulaProfesor = cedulaProfesor;
		this.nombreHilo = nombreHilo;
	}

	// gets y sets
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getCodigoMateria() {
		return this.codigoMateria;
	}

	public void setCodigoMateria(String nombreMateria) {
		this.codigoMateria = nombreMateria;
	}

	public String getCedulaProfesor() {
		return cedulaProfesor;
	}

	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [cedulaEstudiante=" + cedulaEstudiante + ", codigoMateria=" + codigoMateria
				+ ", cedulaProfesor=" + cedulaProfesor + ", nombreHilo=" + nombreHilo + "]";
	}

}
