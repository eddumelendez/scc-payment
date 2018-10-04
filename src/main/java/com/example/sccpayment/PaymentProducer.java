package com.example.sccpayment;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Eddú Meléndez
 * @author Olga Maciaszek-Sharma
 */
@Component
public class PaymentProducer {

	private final Source source;

	public PaymentProducer(Source source) {
		this.source = source;
	}

	public void performPayment(PaymentResponse response) {
		this.source.output().send(MessageBuilder.withPayload(response).build());
	}

}
