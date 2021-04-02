package com.capg.onlinesportsshopee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.onlinesportsshopee.bean.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {
	//public Payment addPayment(Payment payment);
	
	//public Payment removePayment(long id);
	
	//public Payment updatePayment(long paymentId, Payment payment);
	
	//public Payment getPaymentDetails(long id);
	
	//public List<Payment> getAllPaymentDetails();
}
