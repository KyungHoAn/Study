package jp01;
/*
 * FileName : CallByValueTest.java
 */
public class CallByValueTest {
	//Field
	int number =100;
	
	//Method
	public void valueChange(int value) {
		System.out.println("============");
		value = value+100;
		System.out.println("value:"+value);
		System.out.println("============");
	}
	
	//main Mehtod
	public static void main(String[] args) {
		CallByValueTest call = new CallByValueTest();
		
		//method의 인자값으로 int(primitive DataType)
		call.valueChange(call.number);
		System.out.println("number:"+call.number);
	}//end of main
}// end of class
