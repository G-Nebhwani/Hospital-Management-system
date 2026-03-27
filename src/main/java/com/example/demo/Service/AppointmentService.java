package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Appointment;
import com.example.demo.Repo.AppointmentRepository;

@Service
public class AppointmentService {
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private AppointmentRepository appointmentrepo;

	public List<Appointment> getAllAppintments() {
		try {
			System.out.println("List of Appointment");
			return appointmentrepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all Appointment: {}", e.getMessage());
			return null;
		}
	}

	public Appointment getAppointmentById(Long id) {
		try {
			return appointmentrepo.findById(id).orElse(null);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching Appointment By ID : {}", e.getMessage());
			return null;
		}
	}

	public Appointment createAppointment(Appointment appointment) {
		try {
			return appointmentrepo.save(appointment);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating Appointment: {}", e.getMessage());
			return null;
		}
	}

	public void deleteAppiotment(long id) {
		try {
			appointmentrepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting Appointment: {}", e.getMessage());

		}
	}

	public void updateAppointment(Long id, Appointment appointment) {
		try {
			Appointment existing = appointmentrepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));

			existing.setPatientId(appointment.getPatientId());
			existing.setDoctorId(appointment.getDoctorId());
			existing.setDate(appointment.getDate());

			appointmentrepo.save(existing);

		} catch (Exception e) {
			logger.error("An Error is occurred while updating Appointment: {}", e.getMessage());
		}
	}

}
