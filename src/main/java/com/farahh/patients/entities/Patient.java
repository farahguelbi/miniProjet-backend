package com.farahh.patients.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private String adresse ;
	
	private Date dateRendezvous;
	@ManyToOne
	private Genre genre;
	public Patient() {
		super();
	}
	
	public Patient(String nomPatient, String prenomPatient, String adresse, Date dateRendezvous) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.adresse = adresse;
		this.dateRendezvous = dateRendezvous;
	}
	
	
public Long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return prenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateRendezvous() {
		return dateRendezvous;
	}
	public void setDateRendezvous(Date dateRendezvous) {
		this.dateRendezvous = dateRendezvous;
	}
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", adresse=" + adresse + ", dateRendezvous=" + dateRendezvous + ", genre=" + genre + "]";
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}
