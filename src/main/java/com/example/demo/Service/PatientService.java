package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Patient;

@Service
public class PatientService {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
	
	public List<Patient> getAllPatients() {
		try {
			System.out.println("into service Layer");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all patients: {}", e.getMessage());
			return null;
		}
	}
	
	public Patient getPatientById(Long id) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching patients By ID : {}", e.getMessage());
			return null;
		}
	}

	
	public Patient createPatient(Patient patient) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating patients: {}", e.getMessage());
			return null;
		}
	}
	
	public void deletePatient(long id) {
		try {
			return;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting patient: {}", e.getMessage());
			
		}
	}
	
	
	public void updatePatient(Long id) {
		try {
			return ;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while updating patients: {}", e.getMessage());						
		}
	}
	
	

}
