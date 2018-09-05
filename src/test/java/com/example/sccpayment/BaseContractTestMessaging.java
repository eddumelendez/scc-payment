package com.example.sccpayment;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Eddú Meléndez
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SccPaymentApplication.class)
@AutoConfigureMessageVerifier
public class BaseContractTestMessaging {

	@Autowired
	private PaymentProducer paymentProducer;

	public void makeSuccessfulPayment() {
		String uuid = "d64c361b-29bb-43a9-8fe8-5e7e05493842";
		this.paymentProducer.performPayment(new PaymentResponse(uuid, PaymentStatus.SUCCESS));
	}

	public void makePaymentFails() {
		String uuid = "d64c361b-29bb-43a9-8fe8-5e7e05493842";
		this.paymentProducer.performPayment(new PaymentResponse(uuid, PaymentStatus.FAILED));
	}
}
