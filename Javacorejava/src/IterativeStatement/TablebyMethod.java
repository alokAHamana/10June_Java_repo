package IterativeStatement;

public class TablebyMethod {
	
	public static void main(String[] args) {
		
		TablebyMethod tb = new TablebyMethod();
		
		tb. multipleof35(35,1,0);   }

	private void multipleof35(int num, int times, int multiple) {
	
	 while(times<=5) {
		
		multiple = num*times;
		
		System.out.println(multiple);
		times++;
	}
  }
}      //output  =  35,70,105,140,175