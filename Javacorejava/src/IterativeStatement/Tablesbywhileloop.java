package IterativeStatement;
import java.util.Scanner ;
public class Tablesbywhileloop {
	public static void main(String[] args) {
		System.out.println("Enter the no.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		//table(number);  }
	//public static void table(int num) {
		int num = number;            //agar method new bante hai to ise comment kr dengye
		int table = 0;
		int i =  1;
		
		while (i<=10) {
			table = num*i;
			System.out.println(table);
			i++;
		}
} }	             //output = get table of no. you entered
	