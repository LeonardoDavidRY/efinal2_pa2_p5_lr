package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.service.to.MatriculaTO;

public interface IMatriculaService {
	
	public List<MatriculaDTO> reporte();

	public void matriculacionParalela(MatriculaTO matriculaTO);

	public void matricularConCedulaCodigo(String cedula, String codigo, Matricula matricula);

}
