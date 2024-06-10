package com.alokjava1;

public class LeapyearFind {

	public static void main(String[] args) {
		//int year =2023;
		
		LeapyearFind L = new LeapyearFind();
		
		L.leapyear(2023);}
	
	private void leapyear(int year) {
		
		if(year%4==0) {
			System.out.println(" it is Leap year");
		}else {
			System.out.println("it is Not Leap year");
		}
		
	}           // output =  it is not Leap year
}
