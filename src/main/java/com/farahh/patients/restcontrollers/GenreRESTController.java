package com.farahh.patients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farahh.patients.entities.Genre;
import com.farahh.patients.repos.GenreRepository;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRESTController {
	
     @Autowired
	GenreRepository genreRepository;
     @GetMapping
     public List<Genre>getAllGenres()
     {
    	 return genreRepository.findAll();
     }
     @GetMapping("/{id}")
     public Genre getGenreById(@PathVariable("id") Long id ) {
    	 return genreRepository.findById(id).get();
     }
     
}
