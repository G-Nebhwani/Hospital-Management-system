package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column
    private long patientId;
	@Column
    private long doctorId;
	@Column
    private double consultationFee;
	@Column
    private double testCharge;
	@Column
    private double totalAmount;
	@Column
    private String paymentStatus; // PAID / UNPAID
	@Column
    private String paymentMethod; // Cash / Card / UPI
	@Column
    private String billDate;

}
