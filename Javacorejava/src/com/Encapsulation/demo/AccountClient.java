package com.Encapsulation.demo;

public class AccountClient {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setBalance(100000);
		
		System.out.println(acc.getBalance());
	}

}    //output =   100000.0
