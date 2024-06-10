package IterativeStatement;

public class ThreesTable {

	public static void main(String[] args) {
		
		ThreesTable tb = new ThreesTable();
		tb .tables();
	}
	private void tables() {
		int tab = 3 ;
		int i = 1;
		int mul = 0;
		
		while(i<=10){
			
			mul = tab*i;
			System.out.println(mul);
			i++;
		}
	}

}               //output table of 3;
    