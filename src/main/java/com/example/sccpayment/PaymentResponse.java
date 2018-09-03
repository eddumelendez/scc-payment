package com.example.sccpayment;

/**
 * @author Eddú Meléndez
 */
public class PaymentResponse {

	private String uuid;

	private PaymentStatus status;

	public PaymentResponse(String uuid, PaymentStatus status) {
		this.uuid = uuid;
		this.status = status;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public PaymentStatus getStatus() {
		return this.status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
}
