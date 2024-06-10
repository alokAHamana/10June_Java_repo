package com.SwitchDemo;

public class FallThroughSwitch {

	public static void main(String[] args) {
	
		FallThroughSwitch  fl = new FallThroughSwitch();
		   fl. fallthrough(2);       }
	
	private void fallthrough(int w) {
		//int w= 2;
		
		switch(w) {
		
		case 1:
			System.out.println("jan");
		case 2:
			System.out.println("feb");
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
		case 5:
			System.out.println("may");
			break;
		default:
			System.out.println("not matched");
		
		}
	}
}                //output =  feb, march           
