package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Patient;
import com.example.demo.Service.PatientService;


@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping
	public List<Patient> getAllPatients() {
		System.out.println("Fetching the patients");
		return patientService.getAllPatients();
	}

	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable Long id) {
		System.out.println("Fetching id");
		return patientService.getPatientById(id);
	}

	@PostMapping
	public Patient createPatient(@RequestBody Patient patient) {
		System.out.println("Creating patient");
		return patientService.createPatient(patient);
	}



	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
	}

	@PutMapping("/{id}")
	public void updatePatient(@PathVariable long id, @RequestBody Patient patient) {
		patientService.updatePatient(id, patient);

	}




}












