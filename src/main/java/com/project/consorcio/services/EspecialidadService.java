package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Especialidad;
import com.project.consorcio.entity.TipoMedicamento;
import com.project.consorcio.repository.EspecialidadRepository;
import com.project.consorcio.repository.TipoMedicamentoRepository;


@Service
public class EspecialidadService {

	//inyección de dependencias
		@Autowired
		
		private EspecialidadRepository espes;
		
		
		public List<Especialidad> listarespecialidad(){
			return espes.findAll();
			}	
	
}
