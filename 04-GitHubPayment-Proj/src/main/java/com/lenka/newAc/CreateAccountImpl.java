package com.lenka.newAc;

import java.util.Random;

public class CreateAccountImpl implements CreateAccount {

	@Override
	public String create(String name, long adhar, long phno) {
		if(name!=null) {
			return "Account is created ACNo :: "+new Random().nextLong(1700000000);
		}
		return "Invalid credentials";
	}

}
