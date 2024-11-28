package com.farahh.patients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.farahh.patients.entities.Patient;
import com.farahh.patients.service.PatientService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientRESTController {
	@Autowired
	PatientService patientService;
	@GetMapping
	List<Patient>getAllPatients(){
		return patientService.getAllPatients();
	}
	@GetMapping("/{id}")
	 public Patient getPatientByID(@PathVariable("id")Long id) {
		 return patientService.getPatient(id);
	 }
	@PostMapping
	public Patient createPatient(@RequestBody Patient patient ) {
		return patientService.savePatient(patient);
	}
	@PutMapping
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable("id")Long id) {
		patientService.deletePatientById(id);
	}
	@GetMapping("/patsgen/{idGenre}")
	public List<Patient>getPatientByGenreID(@PathVariable("idGenre") Long idGenre){
		return patientService.findByGenreIdGenre(idGenre);
	}
	@GetMapping("/patsByName/{nomPatient}")
	public List<Patient> findByNomPatientContains(@PathVariable("nomPatient") String nomPatient) {
	return patientService.findByNomPatienttContains(nomPatient);
	}
}

