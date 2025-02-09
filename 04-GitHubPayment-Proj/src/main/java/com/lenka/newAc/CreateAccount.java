package com.lenka.newAc;

public interface CreateAccount {

	public String create(String name,long adhar,long phno);
	
	public String applyCard(long accno,long adhar);
}
