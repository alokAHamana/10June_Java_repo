package IterativeStatement;

public class FibonacciSeriesForLoop {

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		int temp = 0;

		System.out.print(x+" "+y+" ");
		
		for (int i = 3; i <= 10; i++) { // i=11

			temp = x + y; // temp=89

			System.out.print(temp + " "); // output - 0 1 1 2 3 5 8 13 21 34

			x = y; // x=55
			y = temp; // y=89
		}

		// output - 0 1 1 2 3 5 8 13 21 34 55 89

	}

}
