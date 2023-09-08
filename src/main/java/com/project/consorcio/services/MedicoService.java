package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Medico;
import com.project.consorcio.repository.MedicoRepository;


@Service
public class MedicoService {
	
	//inyección de dependencias
	@Autowired
	
	private MedicoRepository Medicorepo;
	
	
	//registrar
	public void registrar(Medico m) {
		Medicorepo.save(m);
	}
	
	//Actualizar
		public void Actualizar(Medico m) {
			Medicorepo.save(m);
		}
	
	//Eliminar
		public void eliminarporID(int cod) {
			Medicorepo.deleteById(cod);
		}
	//Buscar (SELECT Where)
		
		public Medico buscarporID(int cod) {
		return Medicorepo.findById(cod).orElse(null);
		}
				
     //Listar todos los empleados (Select * From)
				
		public List<Medico> listartodos(){
			return Medicorepo.findAll();
			}	

}