package com.ag.collection;

public class ArrayofStudentByCustum  {
	
	public static void main(String[] args) {

		StudentCustum[] student = new StudentCustum[3];
		
	   
	   student[0] =new StudentCustum(101,"Alok");
	   
	   student[1] =new StudentCustum(102 ,"ram");
	   
	   student[2] =new StudentCustum(103 ,"ravi");
	   
	   for(StudentCustum  s1 : student) {
		   
		   System.out.println(s1);
		   
	   }
	} 
}
       //o/p =   Stuent[id = 101, name=Alok]
       //        Stuent[id = 102, name=ram]
       //        Stuent[id = 103, name=ravi]

	           
	        

