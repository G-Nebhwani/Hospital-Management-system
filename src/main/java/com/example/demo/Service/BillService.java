package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bill;
import com.example.demo.Repo.BillRepository;

@Service
public class BillService {
	private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private BillRepository billRepo;

	public List<Bill> getAllBills() {
		try {
			System.out.println("into service Layer");
			return billRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching all Bills: {}", e.getMessage());
			return null;
		}
	}

	public Bill getBillById(Long id) {
		try {
			return billRepo.findById(id).orElse(null);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while fetching Bills By ID : {}", e.getMessage());
			return null;
		}
	}

	public Bill createBill(Bill bill) {
		try {
			return billRepo.save(bill);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while creating Bill: {}", e.getMessage());
			return null;
		}
	}

	public void deleteBill(long id) {
		try {
			billRepo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("An Error is occurred while deleting Bill: {}", e.getMessage());

		}
	}

	public void updateBill(Long id, Bill bill) {
		try {
			Bill existing = billRepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Bill not found with id: " + id));

			existing.setPatientId(bill.getPatientId());
			existing.setDoctorId(bill.getDoctorId());
			existing.setConsultationFee(bill.getConsultationFee());
			existing.setTestCharge(bill.getTestCharge());
			existing.setTotalAmount(bill.getTotalAmount());
			existing.setPaymentStatus(bill.getPaymentStatus());
			existing.setPaymentMethod(bill.getPaymentMethod());
			existing.setBillDate(bill.getBillDate());

			billRepo.save(existing);

		} catch (Exception e) {
			logger.error("An Error is occurred while updating Bill: {}", e.getMessage());
		}
	}
}
