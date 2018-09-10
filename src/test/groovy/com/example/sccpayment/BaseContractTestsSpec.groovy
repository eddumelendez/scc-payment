package com.example.sccpayment

import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier

/**
 * @author Olga Maciaszek-Sharma
 */
@SpringBootTest(classes = SccPaymentApplication)
@AutoConfigureMessageVerifier
class BaseContractTestsSpec extends Specification {

	@Autowired
	PaymentProducer paymentProducer

	void makeSuccessfulPayment() {
		String uuid = 'd64c361b-29bb-43a9-8fe8-5e7e05493842'
		paymentProducer.performPayment(new PaymentResponse(uuid, PaymentStatus.SUCCESS))
	}

	void makePaymentFails() {
		String uuid = 'd64c361b-29bb-43a9-8fe8-5e7e05493842'
		paymentProducer.performPayment(new PaymentResponse(uuid, PaymentStatus.FAILED))
	}
}
