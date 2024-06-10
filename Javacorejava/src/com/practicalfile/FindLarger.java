package com.practicalfile;

public class FindLarger {
	
	public static void main(String[] args) {
		
    int a=80,b=50,c=60, larger=0;

		if(a>b) {
			
		if(a>c) {
			larger=a;
		}else {
			larger=c;
		}	
		}else if (b>c) {
			
			larger=b;
		}else {
			larger=c;
		}
		System.out.println("larger value is "+ larger);
	}
}
	
                   //larger = 80
