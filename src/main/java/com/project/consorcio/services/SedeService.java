package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Sede;
import com.project.consorcio.repository.SedeRespository;
import com.project.consorcio.repository.TipoMedicamentoRepository;


@Service
public class SedeService {

	//inyección de dependencias
		@Autowired
		
		private SedeRespository sede;
		
		
		public List<Sede> listarespecialidad(){
			return sede.findAll();
			}	
	
}
