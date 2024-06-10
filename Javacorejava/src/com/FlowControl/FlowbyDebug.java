package com.FlowControl;

public class FlowbyDebug {
	
	
	public static void main(String []args) {
		
	FlowbyDebug ck = new FlowbyDebug();
	
		ck.checknoNegorNot(-11);
	}
		public void checknoNegorNot(int number) {
		
	   if(number<0) {
		 
		   System.out.println("no is neg");
	   
	   }else {
		   System.out.println("no is positive");
	   }
			
		}
	}


