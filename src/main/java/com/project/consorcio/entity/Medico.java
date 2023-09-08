package com.project.consorcio.entity;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_med")
	private Integer codigo;
	@Column(name = "nom_med")
	private String nombre;
	@Column(name = "ape_med")
	private String apellido;
	@Column(name = "fec_nac_med")
	private LocalDate fecha;
	@Column(name = "est_civ_med")
	private String estadoCivil;
	@Column(name = "dni_med")
	private String Dni;
	@Column(name = "sue_med")
	private Double Sueldo;
	@Column(name = "dir_emp")
	private String Direccion;
	
	//RELACION
	@ManyToOne
	@JoinColumn(name="cod_sede")
	private Sede sed;
	
	@ManyToOne
	@JoinColumn(name="cod_espe")
	private Especialidad espe;
	
	@ManyToOne
	@JoinColumn(name="cod_dis")
	private Distrito dist;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public Double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(Double sueldo) {
		Sueldo = sueldo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Sede getSed() {
		return sed;
	}

	public void setSed(Sede sed) {
		this.sed = sed;
	}

	public Especialidad getEspe() {
		return espe;
	}

	public void setEspe(Especialidad espe) {
		this.espe = espe;
	}

	public Distrito getDist() {
		return dist;
	}

	public void setDist(Distrito dist) {
		this.dist = dist;
	}

	
}
	