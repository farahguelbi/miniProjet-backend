package com.farahh.patients.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGenre;
	
	private String nomGenre;
	@OneToMany(mappedBy="genre")
	@JsonIgnore
	private List<Patient>patients;
	public Genre(String nomGenre) {
		this.nomGenre = nomGenre;
	}
	public Genre() {
		super();
	}
public Long getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}
	public String getNomGenre() {
		return nomGenre;
	}
	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}


public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Genre [idGenre=" + idGenre + ", nomGenre=" + nomGenre + ", patients=" + patients + "]";
	}
}
