package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Doctor;
import com.example.demo.Repo.DoctorRepository;

@Service
public class DoctorService {
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private DoctorRepository doctorRepo;

	public List<Doctor> getAllDoctors() {
		try {
			System.out.println("List of Doctor");
			return doctorRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all Doctors: {}", e.getMessage());
			return null;
		}
	}

	public Doctor getDoctorById(Long id) {
		try {
			return doctorRepo.findById(id).orElseThrow(() -> new RuntimeException("Doctor Not found exception : " + id));
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching Doctors By ID : {}", e.getMessage());
			return null;
		}
	}

	public Doctor createDoctor(Doctor doctor) {
		try {
			System.out.println("Doctor created Succesfully");
			return doctorRepo.save(doctor);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating Doctor: {}", e.getMessage());
			return null;
		}
	}

	public void deleteDoctor(long id) {
		try {
			doctorRepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting Doctor: {}", e.getMessage());

		}
	}

	public Doctor updateDoctor(Long id, Doctor d) {
		try {
			Doctor doctor = doctorRepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
			doctor.setName(d.getName());
			doctor.setEmail(d.getEmail());
			doctor.setPhone(d.getPhone());
			doctor.setSpecialization(d.getSpecialization());
			doctor.setExperience(d.getExperience());
			doctor.setAddress(d.getAddress());
			doctor.setCity(d.getCity());
			doctor.setConsultationFee(d.getConsultationFee());

			return doctorRepo.save(d);

		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while updating Doctor: {}", e.getMessage());
			return null;
		}
	}
}
