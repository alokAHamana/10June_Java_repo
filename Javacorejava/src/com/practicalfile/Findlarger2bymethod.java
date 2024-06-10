package com.practicalfile;

public class Findlarger2bymethod {
	
	public static void main(String[] args) {
		Findlarger2bymethod w = new Findlarger2bymethod();
		w.findlarger(51,44,33);
	}
		public  void findlarger(int a ,int b, int c) {
			
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greter");
			}
		}else if (b>c) {
			System.out.println("b is greater");
		
		}else {
			System.out.println("c is greater");
		}
		}                   // a is greater
			                    
		}



