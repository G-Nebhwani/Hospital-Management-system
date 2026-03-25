package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Doctor;

@Service
public class DoctorService {
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	public List<Doctor> getAllDoctors() {
		try {
			System.out.println("into service Layer");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all Doctors: {}", e.getMessage());
			return null;
		}
	}
	
	public Doctor getDoctorById(Long id) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching Doctors By ID : {}", e.getMessage());
			return null;
		}
	}


	public Doctor createDoctor(Doctor doctor) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating Doctor: {}", e.getMessage());
			return null;
		}
	}
	
	public void deleteDoctor(long id) {
		try {
			return;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting Doctor: {}", e.getMessage());
			
		}
	}
	
	
	public void updateDoctor(Long id) {
		try {
			return ;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while updating Doctor: {}", e.getMessage());
						
		}
	}

}
