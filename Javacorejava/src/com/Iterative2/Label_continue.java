package com.Iterative2;

public class Label_continue {

	public static void main(String[] args) {
		
		l1:
			for(int i=0; i<3; i++) {
				for(int j=0; j<=3; j++) {
					
					if(i==j)
					continue;
					System.out.println(i+"    "+j);
				}
			}}}              //output =     0    1
                                  //		0    2
                                  //		0    3
                                  //		1    0
                                  //		1    2
                                  //		1    3
                                  //		2    0
                                  //		2    1
                                  //		2    3

                               
                             
