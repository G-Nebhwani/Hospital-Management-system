package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Patient;
import com.example.demo.Repo.PatientRepository;

@Service
public class PatientService {

	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private PatientRepository patientRepo;

	public List<Patient> getAllPatients() {
		try {
			System.out.println("into service Layer");
			return patientRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all patients: {}", e.getMessage());
			return null;
		}
	}

	public Patient getPatientById(Long id) {
		try {
			return patientRepo.findById(id).orElse(null);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching patients By ID : {}", e.getMessage());
			return null;
		}
	}

	public Patient createPatient(Patient patient) {
		try {
			return patientRepo.save(patient);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating patients: {}", e.getMessage());
			return null;
		}
	}

	public void deletePatient(long id) {
		try {
			logger.info("Patient is deleted Successfully");
			patientRepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting patient: {}", e.getMessage());

		}
	}

	public Patient updatePatient(Long id, Patient patient) {
		try {
			Patient existingPatient = patientRepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
			// Update only non-null fields (prevents overwriting with null)
			if (patient.getName() != null) {
				existingPatient.setName(patient.getName());
			}
			if (patient.getAge() != null) {
				existingPatient.setAge(patient.getAge());
			}
			if (patient.getGender() != null) {
				existingPatient.setGender(patient.getGender());
			}
			if (patient.getPhone() != null) {
				existingPatient.setPhone(patient.getPhone());
			}
			if (patient.getEmail() != null) {
				existingPatient.setEmail(patient.getEmail());
			}
			if (patient.getAddress() != null) {
				existingPatient.setAddress(patient.getAddress());
			}
			if (patient.getCity() != null) {
				existingPatient.setCity(patient.getCity());
			}
			if (patient.getBloodGroup() != null) {
				existingPatient.setBloodGroup(patient.getBloodGroup());
			}
			if (patient.getDisease() != null) {
				existingPatient.setDisease(patient.getDisease());
			}
			if (patient.getMedicalHistory() != null) {
				existingPatient.setMedicalHistory(patient.getMedicalHistory());
			}
			return patientRepo.save(existingPatient);
		} catch (Exception e) {
			logger.error("Error while updating patient with id {}: {}", id, e.getMessage());
			throw e;
		}
	}
}
