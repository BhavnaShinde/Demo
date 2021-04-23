package com.cg.grocerydeliveryapplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.grocerydeliveryapplication.domain.Payment;
import com.cg.grocerydeliveryapplication.repository.PaymentRepository;

@SpringBootTest
class GroceryApplicationTests {
	@Autowired
	PaymentRepository paymentDao;
//	@Test
//	public void testListPayment() {
//	List<Payment> payList = (List<Payment>) paymentDao.findAll();
//		assertThat(payList).size().isGreaterThan(0);
//}
	
//	@Test
//	public void addPayment () {
//		Payment p = new Payment();
//		
//		p.setCardHolderName("shefali");
//	        p.setCardNumber("1234123412341234");
//	        p.setCvv(123);
//	        p.setExpiryDate("11/27");
//	        p.setOtp(4242);
//	        p.setPaymentMode("credit card");
//	        p.setPaymentStatus("done");
//
//		paymentDao.save(p);
//		assertNotNull(paymentDao.findById(1).getId());
//	}
	
//	@Test
//	public void testDelete () {
//		paymentDao.deleteById(1L);
//		assertThat(paymentDao.existsById(1L)).isFalse();
//	}
	@Test
	void contextLoads() {
	}

}
