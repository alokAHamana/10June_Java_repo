package IterativeStatement;

public class FactorsofNum {
	
		public static void main(String[] args) {
			
			FactorsofNum tb = new FactorsofNum();
			
			tb. factorsof10(10,1,0);   }

		private void factorsof10(int num, int times, int factors) {
		
		 while(times<=10) {
			
			factors = num/times;
			
			System.out.println(factors);
			times++;
		}
	  }
	}      //output  =  35,70,105,140,175


