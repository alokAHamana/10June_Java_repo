package com.alokjava1;

public class Grade_if_else {

	public static void main(String[] args) {
		
       int marks = 90;
       
       if(marks<=50) {
    	   
    	   System.out.println("fail");

       }else if(marks>=50 && marks<70) {
    	   
    	   System.out.println("D");
       }
       else if(marks>=70  &&  marks<80) {
    	   
    	   System.out.println(" C ");
       }
       else if(marks>=80  && marks<90) {
    	   
    	   System.out.println(" B "); 
       }
       else if(marks>=90  && marks<=100) {
    	   
    	   System.out.println(" A ");
       }
       else {
    	   System.out.println("invalid");
       }
	}
}
