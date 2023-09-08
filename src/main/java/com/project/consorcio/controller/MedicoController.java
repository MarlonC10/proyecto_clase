package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.DistritoService;
import com.project.consorcio.services.EspecialidadService;
import com.project.consorcio.services.MedicoService;
import com.project.consorcio.services.SedeService;
@Controller
@RequestMapping("/medico")
public class MedicoController {
	
@Autowired
private MedicoService Medi;

@Autowired
private EspecialidadService espe;

@Autowired
private SedeService sede;

@Autowired
private DistritoService dis;

	

//crar direccin de url para mostra la pagina "medicamento.html"

@RequestMapping("/lista")
public String index(Model model){
	//crear atributo
	
	model.addAttribute("medicos", Medi.listartodos());
	
	model.addAttribute("especialidad",espe.listarespecialidad());
	
	model.addAttribute("sede",sede.listarespecialidad());
	
	model.addAttribute("distrito",dis.listarespecialidad());
	
	return "medico";
}
	

}
