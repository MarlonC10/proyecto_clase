package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Distrito;
import com.project.consorcio.entity.Sede;
import com.project.consorcio.repository.DistritoRespository;
import com.project.consorcio.repository.SedeRespository;
import com.project.consorcio.repository.TipoMedicamentoRepository;

@Service
public class DistritoService {

	//inyección de dependencias
		@Autowired
		
		private DistritoRespository dis;
		
		
		public List<Distrito> listarespecialidad(){
			return dis.findAll();
			}	
	
}
