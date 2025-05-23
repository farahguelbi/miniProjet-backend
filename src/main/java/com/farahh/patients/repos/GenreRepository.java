package com.farahh.patients.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.farahh.patients.entities.Genre;
@RepositoryRestResource(path="genre")
@CrossOrigin(origins ="http://localhost:4200/")
public interface GenreRepository extends JpaRepository<Genre,Long>{

}
