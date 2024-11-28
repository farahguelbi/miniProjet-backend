package com.farahh.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farahh.patients.entities.Genre;
import com.farahh.patients.entities.Patient;
import com.farahh.patients.repos.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
    PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient p) {
		return patientRepository.save(p);
	}

	@Override
	public Patient updatePatient(Patient p) {
		return patientRepository.save(p);

	}

	@Override
	public void deletePatient(Patient p) {
		patientRepository.delete(p);
		
	}

	@Override
	public void deletePatientById(Long id) {
		patientRepository.deleteById(id);

	}

	@Override
	public Patient getPatient(Long id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public List<Patient> findByNomPatient(String nom) {
		return patientRepository.findByNomPatient(nom);
	}

	@Override
	public List<Patient> findByNomPatienttContains(String nom) {
	
		return patientRepository.findByNomPatientContains(nom);
	}

	@Override
	public List<Patient> findByNomPrenom(String nom, String prenom) {
		return patientRepository.findByNomPrenom(nom,prenom);
	}

	@Override
	public List<Patient> findByGenre(Genre genre) {
		return patientRepository.findByGenre(genre);
	}

	@Override
	public List<Patient> findByGenreIdGenre(Long id) {
		return patientRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Patient> findByOrderByNomPatientAsc() {
		return patientRepository.findByOrderByNomPatientAsc();
	}

	@Override
	public List<Patient> trierPatientsNomsPrenom() {
		return patientRepository.trierPatientsNomsPrenom();
	}
	
	

}
