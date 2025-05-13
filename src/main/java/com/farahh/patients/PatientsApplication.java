package com.farahh.patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.farahh.patients.entities.Genre;
import com.farahh.patients.entities.Patient;

import jakarta.annotation.PostConstruct;
@SpringBootApplication
public class PatientsApplication implements CommandLineRunner {
   
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PatientsApplication.class, args);
	}
	@Override
	public void run(String...args)throws Exception{
		repositoryRestConfiguration.exposeIdsFor(Patient.class,Genre.class);
		
	}
	
	

}
