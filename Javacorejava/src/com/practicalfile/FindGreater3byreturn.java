package com.practicalfile;

public class FindGreater3byreturn {
		
			public static void main(String[] args) {
				
		FindGreater3byreturn f = new FindGreater3byreturn();
				
			String message = f.findgreateroftwono(100.213654 ,100.213655);
			
			System.out.println(message);}
			
		public String findgreateroftwono(double a,double b) {
			
			if(a>b) {
				
				return "Greater is a ";
			
			}else {
				
				return "Greater is b  ";
			}
			
			}
			                   //Outpout = Greater is b
			}

		              



