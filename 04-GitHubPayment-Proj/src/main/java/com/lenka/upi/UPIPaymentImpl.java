package com.lenka.upi;

public class UPIPaymentImpl implements UPIPayment {

	@Override
	public String payment(String accno, double amount) {
		return amount +" is debited from ACNo :: "+accno;
	}

}
