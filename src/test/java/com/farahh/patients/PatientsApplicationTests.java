package com.farahh.patients;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.farahh.patients.entities.Genre;
import com.farahh.patients.entities.Patient;
import com.farahh.patients.repos.PatientRepository;

@SpringBootTest
class PatientsApplicationTests {
	@Autowired
	private PatientRepository patientRepository;


	//@Test
	
	public void testCreatePatient() {
		Patient pat = new Patient("benhmida","feriel","av3",new Date());
		patientRepository.save(pat);
		
}
	//@Test
	public void testFindPatient()
	{
	Patient p = patientRepository.findById(1L).get();
	System.out.println(p);
	}
	//@Test
	public void testUpdatePatient()
	{
	Patient p = patientRepository.findById(1L).get();
	p.setAdresse("av2");
	patientRepository.save(p);

	}
	//@Test
	public void testDeletPatient() {
		patientRepository.deleteById(1L);
	}
	@Test
	public void testListerTousPatients()
	{
	List<Patient> pats = patientRepository.findAll();
	for (Patient p : pats)
	{
	System.out.println(p);
	}
	}
	//@Test
		public void testFindPatientByNom()
		{
		List<Patient> p = patientRepository.findByNomPatient("Guelbi");
		System.out.println(p);
		}

		//@Test
		public void testFindPatientByNomContains()
		{
		List<Patient> p = patientRepository.findByNomPatientContains("t");
		System.out.println(p);
		}

		@Test
		public void testfindByNomPrenom()
		{
		List<Patient> pats = patientRepository.findByNomPrenom("telmoudi", "hager");
		for (Patient p : pats)
		{
		System.out.println(p);
		}
		}
		@Test
		public void testfindByGenre()
		{
		Genre gen = new Genre();
		gen.setIdGenre(1L);
		List<Patient> pats = patientRepository.findByGenre(gen);
		for (Patient p : pats)
		{
		System.out.println(p);
		}
		}
		
		@Test
		public void testfindByGenreIdGenre()
		{
		
		List<Patient> pats = patientRepository.findByGenreIdGenre(2L);
		for (Patient p : pats)
		{
		System.out.println(p);
		}
		}
		@Test
		public void testfindByOrderByNomPatientAsc()
		{
		List<Patient> pats =
		patientRepository.findByOrderByNomPatientAsc();
		for (Patient p : pats)
		{
		System.out.println(p);
		}
		}
		@Test
		public void testTrierPatientsNomsPrenom()
		{
		List<Patient> pats = patientRepository.trierPatientsNomsPrenom();
		for (Patient p : pats)
		{
		System.out.println(p);
		}
		}

}
