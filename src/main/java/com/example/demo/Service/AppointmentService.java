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
			System.out.println("into service Layer");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all Appointment: {}", e.getMessage());
			return null;
		}
	}

	public Appointment getAppointmentById(Long id) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching Appointment By ID : {}", e.getMessage());
			return null;
		}
	}


	public Appointment createAppointment(Appointment appointment) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating Appointment: {}", e.getMessage());
			return null;
		}
	}

	public void deleteAppiotment(long id) {
		try {
			return;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting Appointment: {}", e.getMessage());

		}
	}


	public void updateAppointment(Long id) {
		try {
			return ;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while updating Appointment: {}", e.getMessage());
		}
	}

}
