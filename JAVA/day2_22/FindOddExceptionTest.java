package jp02;

class FindOddException extends Exception {
	//Field
	//Constructor
	public FindOddException() {
		System.out.println("==> FindOddException Default Constructor");
	}
	public FindOddException(String msg) {
		super(msg);
		System.out.println("==>인자가 있는 FindOddException Constructor");
	}
}//end of class

public class FindOddExceptionTest{
	//Field
	//Constructor
	public FindOddExceptionTest() {
		
	}
	//Mehtod
	//홀수가 입력되면 FindOddException발생 시키는 Mehtod
	public void test(int number) throws FindOddException{
		System.out.println("::"+this.getClass().getName()+"start..");
		
		if(number %2 ==0) {
			System.out.println("입력하신 수:"+number);
		}else {
			throw new FindOddException();
		}
		System.out.println(":: "+this.getClass().getName()+"end.\n");
	}
	
	//Main method
	public static void main(String[] args) {
		FindOddExceptionTest met = new FindOddExceptionTest();
		try {
			met.test(10);
			met.test(11);
		}catch(FindOddException e) {
			System.out.println("\n e:"+e);
		}
	}//end of main
}// end of class
