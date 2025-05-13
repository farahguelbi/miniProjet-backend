package com.farahh.patients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<Patient> getAllPatients() {
	return patientService.getAllPatients();
	} 
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	 public Patient getPatientByID(@PathVariable("id")Long id) {
		 return patientService.getPatient(id);
	 }
	@RequestMapping(path="/addpats",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Patient createPatient(@RequestBody Patient patient ) {
		return patientService.savePatient(patient);
	}
	@RequestMapping(path="/updatepats",method = RequestMethod.PUT)
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	@RequestMapping(value="/delpats/{id}",method = RequestMethod.DELETE)
	public void deletePatient(@PathVariable("id")Long id) {
		patientService.deletePatientById(id);
	}
	@RequestMapping(value="/patsgen/{idGenre}",method = RequestMethod.GET)

	public List<Patient>getPatientByGenreID(@PathVariable("idGenre") Long idGenre){
		return patientService.findByGenreIdGenre(idGenre);
	}
	@GetMapping("/patsByName/{nomPatient}")
	public List<Patient> findByNomPatientContains(@PathVariable("nomPatient") String nomPatient) {
	return patientService.findByNomPatienttContains(nomPatient);
	}
}

