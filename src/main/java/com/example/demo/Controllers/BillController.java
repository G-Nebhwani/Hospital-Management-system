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

import com.example.demo.Model.Bill;

@RestController
@RequestMapping("/api/v1/Bill")
public class BillController {
	@GetMapping
	public List<Bill> getAllBills() {
		return null;
	}
	
	@PostMapping
	public Bill createBill(@RequestBody Bill bill) {
		return bill;
	}
	
	@GetMapping("/{id}")
	public Bill getBillById(@PathVariable long id) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteBill(@PathVariable long id) {
		
	}
	
	@PutMapping("/{id}")
	public void updateBill(@PathVariable long id) {
		
	}
}
