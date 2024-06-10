package com.alokjava1;

public class Test2 {

		public static void main(String[] args) {
			
			System.out.println("Main method");
			
			Test2 t = new Test2();
			
			//t.add(10,20);
			//Test2.add(10,20);
			add(10,20);	
			}
		public static void add(int a,int b) {
			
			int sum = a+b;
			
			System.out.println(sum);
		}
				
		}
