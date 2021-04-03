package com.capg.onlinesportsshopee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capg.onlinesportsshopee.bean.Payment;

class PaymentServiceImpTest {
	
	@Autowired
	IPaymentService paymentService;
	
	List<Payment> list = new ArrayList<>();

	@Test
	void testAddPayment() {
		LocalDate expiryDate=LocalDate.parse("2025-05-24");
		Payment paymentTemp=new Payment(1, "debit","paid",1, "SyedSamsu","1244652347891236",expiryDate,256);
		assertEquals(paymentTemp,paymentService.addPayment(paymentTemp));
		list.add(paymentTemp);
	}

	@Test
	void testRemovePayment() {
		LocalDate expiryDate=LocalDate.parse("2025-07-24");
		Payment paymentTemp=new Payment(2, "debit","paid",2, "SyedSamsu","1244652347891236",expiryDate,256);
		paymentService.addPayment(paymentTemp);
		assertNotEquals(paymentTemp,paymentService.removePayment(paymentTemp.getPaymentId()));
		
	}

	@Test
	void testUpdatePayment() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPaymentDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllPaymentDetails() {
		fail("Not yet implemented");
	}

	@Test
	void testValidatePaymentType() {
		fail("Not yet implemented");
	}

	@Test
	void testValidatePaymentStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testValidateCardName() {
		fail("Not yet implemented");
	}

	@Test
	void testValidateCardNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testValidateCvv() {
		fail("Not yet implemented");
	}

	@Test
	void testValidateCardExpiry() {
		fail("Not yet implemented");
	}

}
