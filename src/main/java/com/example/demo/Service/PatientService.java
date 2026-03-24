package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Patient;

@Service
public class PatientService {
	public List<Patient> getAllPatients() {
		try {
			System.out.println("into service Layer");
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public Patient getPatientById(Long id) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	
	public Patient createPatient(Patient patient) {
		try {
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public void deletePatient(long id) {
		try {
			return;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	
	
	public void updatePatient(Long id) {
		try {
			return ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ;			
		}
	}
	
	

}
