package com.uce.edu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.service.IMatriculaService;
import com.uce.edu.service.to.MatriculaTO;


@Controller
@RequestMapping(value = "/matriculas")
public class MatriculaControler {
	
	@Autowired
	private IMatriculaService iMatriculaService;

	@GetMapping(value = "/inicioReporte")
	public String iniciarReporte(MatriculaDTO matriculaDTO, Model model) {
		List<MatriculaDTO> matriculas = this.iMatriculaService.reporte();
		model.addAttribute("reporteModel", matriculas);
		return "vistaReporteMatriculas";
	}

	@GetMapping(value = "/inicioMatricula")
	public String iniciarMatricula(MatriculaTO matriculaTO) {
		return "vistaRegistroMatriculas";
	}

	@PostMapping(value = "/matricular")
	public String matricular(MatriculaTO matriculaTO) {
		this.iMatriculaService.matriculacionParalela(matriculaTO);
		return "redirect:/matriculas/inicioMatricula";
	}
	

}
