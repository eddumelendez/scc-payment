package com.example.sccpayment;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Component;

/**
 * @author Eddú Meléndez
 */
@Component
public class PaymentProducer {

	private final Source source;

	public PaymentProducer(Source source) {
		this.source = source;
	}

	public void performPayment(PaymentResponse response) {
//		Method implementation missing;
	}

}
