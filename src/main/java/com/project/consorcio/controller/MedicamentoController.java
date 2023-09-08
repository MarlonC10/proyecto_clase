package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.MedicamentoService;
import com.project.consorcio.services.TipoMedicamentoService;

@Controller
@RequestMapping("/medicamento")
public class MedicamentoController {
	
@Autowired
private MedicamentoService Mepo;

@Autowired
private TipoMedicamentoService Tipo;
	

//crar direccin de url para mostra la pagina "medicamento.html"

@RequestMapping("/lista")
public String index(Model model){
	//crear atributo
	
	model.addAttribute("medicamentos", Mepo.listartodos());
	
	model.addAttribute("tipomedicamentos",Tipo.listarTipoMedicamento());
	
	return "medicamento";
}
	

}
