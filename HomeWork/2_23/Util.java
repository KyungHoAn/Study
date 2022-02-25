package homework;

public class Util {
	private int count;
	   //인자로 받은 limit 까지의 소수의 갯수를 return하는 Method
	   public int findPrimeCount(int limit) {
	      ///아래에 구현
//		  int count=0;
	      boolean prime = false;
	      for(int i=2; i<=limit; i++) {
	         prime = true;
	         for(int j=2; j<i; j++) {
	            if(i%j ==0) {
	               prime = false;
	               break;
	            }
	         }
	         if(prime) {
	            count++;
	         }
	      }
	      return count;
	   }//end of method
	   
	   //인자로 받은 limit까지의 소수갯수 배열크기를 같는 int배열에 담아 return하는 Method
	   public int[] findPrimeReturnArray(int limit) {
	      //아래에 구현
		  int[] array = new int[count];
		  int n =0;
		  boolean prime = false;
		      for(int i=2; i<=limit; i++) {
		         prime = true;
		         for(int j=2; j<i; j++) {
		            if(i%j ==0) {
		               prime = false;
		               break;
		            }
		         }
		         if(prime) {
		        	 array[n++] = i;
		         }
		      }
		      return array;
	   }//end of method
}//end of class
