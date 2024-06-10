package com.FlowControl;

public class FlowDebug2 {
	
	public static void main(String []args) {
		
		//FlowbyDebug ck = new FlowbyDebug();
		
		String message = checknoNegorNot(-11);
		
		System.out.println(message);
		}
			public static String checknoNegorNot(int number) {
			
		   if(number<0) {
			 
			   return "Entre no is neg";
		   
		   }else {
			   return "Entre no is positive";
		   }	
			}
		}


