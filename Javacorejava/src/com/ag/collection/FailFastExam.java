package com.ag.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExam{
	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<>();
		
		ar.add(1);    // 0           0
		ar.add(2);    // 1           1
		ar.add(3);    // 2              remove(3) yaha value remove ho rhi hai 
		ar.add(4);    // 3           2  remove[2]index yaha index remove ho rha hai
		ar.add(5);    // 4           3

		Iterator<Integer> itr = ar.iterator();
		
		while (itr.hasNext()) {
	            if (itr.next() == 3) {     // jab hme  value=3 mile jayegi
	                itr.remove();    }     //  tu use value3 ko remove kr dengye
	                           }
		System.out.println(ar);
	
		itr=ar.iterator();
		while(itr.hasNext()) {
			 if(itr.next()==2) {       // yaha jab hme value=2 mile jaye gi to      
				 ar.remove(2);         // hme inde[2] jo 4 hai use remove kr denge
			 }
			 System.out.println(ar);
		}
}            /// yaha 2nd condi mein concurent modification execption show karega
}
    