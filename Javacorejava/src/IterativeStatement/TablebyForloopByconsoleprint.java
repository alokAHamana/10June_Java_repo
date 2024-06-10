package IterativeStatement;
import java.util.Scanner;
public class TablebyForloopByconsoleprint {

	public static void main(String[] args) {

		System.out.println("Entre the no.");
		Scanner sc = new Scanner(System.in);
		int tab = sc.nextInt();
		
		tables(tab);     }
	public static void tables(int no) {
		//int temp =1111110;                
		
		for(int i=1;i<=10;i++) {
			
		int	temp = no*i;
			
			System.out.println(temp);
		}
		
	}
}               //output = get the table of entred no.
