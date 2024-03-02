package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;



@Controller
@RequestMapping(value = "/materias")
public class MateriaController {
	
	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping(value = "/inicioRegistro")
	public String inicarRegistro(Materia materia) {
		return "vistaRegistroMaterias";
	}

	@PostMapping(value = "/registrar")
	public String registrar(Materia materia) {
		this.iMateriaService.guardar(materia);
		return "redirect:/materias/inicioRegistro";
	}

}
