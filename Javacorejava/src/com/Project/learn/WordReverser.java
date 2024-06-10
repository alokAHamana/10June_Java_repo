package com.Project.learn;
import java.util.Scanner;

public class WordReverser {

	public static void main(String[] args) {
		System.out.println("Enter a Word:");	
		
		Scanner scanner = new Scanner(System.in);
		String word =scanner.nextLine();
		
		
		String reversed = new StringBuilder(word).reverse().toString();
		
		System.out.println( reversed);
	}
}

	
	

