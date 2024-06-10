package IterativeStatement;

public class ForLoop_oddNo {
//find odd no
	public static void main(String[] args) {
		
		int n=15;
		for(int i=0; i<=n; i++) {
			
			System.out.print(2*i+1+", ");     }
			
            //output = 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 

//find even no.
             for(int j=0; j<=n; j++) {
            	 
                 System.out.print(2*j+ " ");            	 
             }
	}                  //output= 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
}