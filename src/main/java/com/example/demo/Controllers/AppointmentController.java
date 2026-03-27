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

import com.example.demo.Model.Appointment;

@RestController
@RequestMapping("/api/v1/Appointment")
public class AppointmentController {

	@GetMapping
	public List<Appointment> getAllAppintments() {
		return null;
	}

	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable long id) {
		return null;
	}

	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointment;
	}


	@DeleteMapping("/{id}")
	public void deleteAppiotment(@PathVariable long id) {

	}

	@PutMapping("/{id}")
	public void updateAppointment(@PathVariable long id, @RequestBody Appointment appointment) {

	}

}
