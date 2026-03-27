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

import com.example.demo.Model.Doctor;
import com.example.demo.Service.DoctorService;

@RestController
@RequestMapping("/api/v1/Doctor")
public class DoctorController {

	@Autowired
	DoctorService docService;


	@GetMapping
	public List<Doctor> getAllDoctors() {
		System.out.println("Fetching All Available Doctors");
		return docService.getAllDoctors();
	}

	@PostMapping
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		System.out.println("Doctor create successfully");
		return docService.createDoctor(doctor);
	}

	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable long id) {
		return docService.getDoctorById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable long id) {
		System.out.println("Doctor data deleted successfully");
		docService.deleteDoctor(id);

	}

	@PutMapping("/{id}")
	public void updateDoctor(@PathVariable long id, @RequestBody Doctor doctor) {
		System.out.println("Update data");
		docService.updateDoctor(id, doctor);
	}

}
