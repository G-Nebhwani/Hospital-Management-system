package com.example.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Doctor;

@RestController
@RequestMapping("/api/v1/Doctor")
public class DoctorController {
	@GetMapping
	public List<Doctor> getAllDoctors() {
		return null;
	}
	
	@PostMapping
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctor;
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable long id) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteDoctor(@PathVariable long id) {
		
	}
	
	@PutMapping("/{id}")
	public void updateDoctor(@PathVariable long id) {
		
	}	
}
