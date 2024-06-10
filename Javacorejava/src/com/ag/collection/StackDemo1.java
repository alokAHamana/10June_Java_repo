
package com.ag.collection;

import java.util.Stack;

public class StackDemo1 {
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(12);
		st.push(15);
		st.push(50);
		st.push(null);
		st.push(5);
		
		System.out.println(st);
		
		System.out.println(st.pop());// last wale ko print krke hta deta hai
		
		for(Integer it :st) {
		System.out.println(it);
		}
	}
}
