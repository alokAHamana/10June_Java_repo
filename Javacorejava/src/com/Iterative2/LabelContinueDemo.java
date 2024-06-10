package com.Iterative2;

public class LabelContinueDemo {
	
	public static void main(String[] args) {
		
		l1:   for(int i=0; i<3; i++) {     // i=0,          1,          2,              3
			    for(int j=0;j<3; j++){    // j=0,        0/1,      0/1/2         exit frm loop
			    	                      // cn-go-1st     /cn         /cn             
			    	if(i==j)
			    		continue l1;
			    	
			    	System.out.println(i+"     "+j);
	}	   }
	}
}               // output= 1     0
	           //          2     0
	          //           2     1

