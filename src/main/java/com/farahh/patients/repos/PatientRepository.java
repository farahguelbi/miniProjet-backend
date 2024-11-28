package com.farahh.patients.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.farahh.patients.entities.Genre;
import com.farahh.patients.entities.Patient;

@RepositoryRestResource(path = "rest")
public interface PatientRepository extends JpaRepository<Patient, Long> {
 List<Patient> findByNomPatient(String nom);
 List<Patient> findByNomPatientContains(String nom);
 /*@Query("select p from Patient p where p.nomPatient like%?1 and p.prenomPatient like %?2")
List<Patient>findByNomPrenom(String nom,String prenom );*/
 @Query("select p from Patient p where p.nomPatient like %:nom and p.prenomPatient like%:prenom")
 List<Patient>findByNomPrenom(@Param("nom")String nom,@Param("prenom") String prenom);

@Query("select p from Patient p where p.genre =?1")
List<Patient>findByGenre(Genre genre);
 /*@Query("SELECT p FROM Patient p JOIN FETCH p.genre WHERE p.genre = :genre")
 List<Patient> findByGenre(@Param("genre") Genre genre);
*/
List<Patient>findByGenreIdGenre(Long id);
 /*@Query("SELECT p FROM Patient p WHERE p.genre.idGenre = :genreId")
 List<Patient> findByGenreIdGenre(@Param("genreId") Long genreId);
*/
List<Patient>findByOrderByNomPatientAsc();
@Query("select p from Patient p order by p.nomPatient ASC, p.prenomPatient DESC")
List<Patient> trierPatientsNomsPrenom ();

}