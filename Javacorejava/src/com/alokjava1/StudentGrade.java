package com.alokjava1;

public class StudentGrade {

	public static void main(String[] args) {
		
		grade();}
	public static void grade() {
	  int Hindi = 85;
	  int Eng   =80;
	  int Math  = 95;
	  int Pysics =93;
	  int chem   =80;
	  
	  int Total = 500;
	  int Totalmarks = Hindi+Eng+Math+Pysics+chem;
	  int Percentage = (Totalmarks*100)/Total;
	  
	  if(Percentage>85) {
		  System.out.println("grade A");
		  }else if(Percentage>75){
			  System.out.println("grade B");
		  }else if (Percentage>70) {
			  System.out.println("grade c");
		  }else if (Percentage<33) {
			  System.out.println("grade Fail");
		  }
	}                    
}                        // Output = grade A