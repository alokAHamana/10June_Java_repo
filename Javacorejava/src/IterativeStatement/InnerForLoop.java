package IterativeStatement;

public class InnerForLoop {
	public static void main(String[] args) {
		
		for(int i=1; i<=3 ;i++) {               //i  = 1            i= 2                 i= 3
			
			for(int j=1; j<=6; j++) {   // j  = 1,2,3,4,5,6      j=1,2,3,4,5,6      1,2,3,4,5,6
				
				System.out.print(j);
			}
		         System.out.println();
		}
	}	
}           /* output = 123456     ->ye print hoga jab {i = 1} hoga
	                    123456     -> ye print hoga jab {i = 2} hoga
	                    123456     ->  ye print hoga jab {i = 3} hoga
	                                                                                */



