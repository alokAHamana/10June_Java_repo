package com.SwitchDemo;

public class WhetherbyFallthrough {
	
	public static void main(String[] args) {
		
		WhetherbyFallthrough wh = new WhetherbyFallthrough();
		                                      //int num = 11 ;    
  		wh.findWhether() ;   }              // wh.findWhether(x) ;   } 

		private void findWhether() {        // private void findWhether(int num) { 
		 int num = 11;
		
		 switch(num) {
		
		case 3:
		case 4:
		case 5:
			System.out.println("summer");
		    break;
		case 6:
		case 7:
		case 8:
			System.out.println("monson");
		    break;
		case 9:
		case 10:
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
		default:
			System.out.println( "not matched");
		}
	}
	
}                 //output  = winter , not matched