package com.farahh.patients.service;

import java.util.List;

import com.farahh.patients.entities.Genre;
import com.farahh.patients.entities.Patient;

public interface PatientService {
	Patient savePatient(Patient p);
	Patient updatePatient(Patient p);
	void deletePatient(Patient p);
	 void deletePatientById(Long id);
	Patient getPatient(Long id);
	List<Patient> getAllPatients();
	List<Patient> findByNomPatient(String nom);
	List<Patient> findByNomPatienttContains(String nom);
	List<Patient> findByNomPrenom (String nom, String prenom);
	List<Patient> findByGenre (Genre genre);
	List<Patient> findByGenreIdGenre(Long id);
	List<Patient> findByOrderByNomPatientAsc();
	List<Patient> trierPatientsNomsPrenom();
}
 