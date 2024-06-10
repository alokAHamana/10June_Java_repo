package IterativeStatement;

public class NineTable {
	public static void main(String[] args) {
	
		NineTable tb = new NineTable();
		tb .tables();     }
	
		private void tables() {
			int tab = 9;
			int i = 1;
			int table = 0;

			while(i<=10){
			
			table = tab*i;
		System.out.println(table);
		i++;
	}
}

}               //output table of 9;


