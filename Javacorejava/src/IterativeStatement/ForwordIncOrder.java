package IterativeStatement;

public class ForwordIncOrder {
	public static void main(String[] args) {
		ForwordIncOrder fb = new ForwordIncOrder();
		fb.writeNo1to15(1);}
	
	private void writeNo1to15(int num) {
		                                            //int num = 1;
		
		while(num<=15) {
			
			System.out.println(num);
			num++;
		}
	}

}          //output = 123456789.....15
