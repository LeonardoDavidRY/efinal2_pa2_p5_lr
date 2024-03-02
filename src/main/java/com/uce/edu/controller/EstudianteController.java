package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IEstudianteService;

@Controller
@RequestMapping(value = "/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService iEstudianteService;

	@GetMapping(value = "/inicioRegistro")
	public String inicarRegistro(Estudiante estudiante) {
		return "vistaRegistroEstudiantes";
	}

	@PostMapping(value = "/registrar")
	public String registrar(Estudiante estudiante) {
		this.iEstudianteService.guardar(estudiante);
		return "redirect:/estudiantes/inicioRegistro";
	}

}
