package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Medicamento;
import com.project.consorcio.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	
	//inyección de dependencias
	@Autowired
	
	private MedicamentoRepository Medrepo;
	
	
	//registrar
	public void registrar(Medicamento m) {
		Medrepo.save(m);
	}
	
	//Actualizar
		public void Actualizar(Medicamento m) {
			Medrepo.save(m);
		}
	
	//Eliminar
		public void eliminarporID(int cod) {
			Medrepo.deleteById(cod);
		}
	//Buscar (SELECT Where)
		
		public Medicamento buscarporID(int cod) {
		return Medrepo.findById(cod).orElse(null);
		}
				
     //Listar todos los empleados (Select * From)
				
		public List<Medicamento> listartodos(){
			return Medrepo.findAll();
			}	

}
