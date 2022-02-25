package jp01;
/*
 * FileName : CallByReferenceTest.java
 */
public class CallByReferenceTest {
	//Field
	int number = 100;
	
	//Mehtod
	public void referenceChange(CallByReferenceTest value) {
		System.out.println("============");
		value.number =100+value.number;
		System.out.println("value.number:"+value.number);
		System.out.println("============");
	}
	
	//main method
	public static void main(String[] args) {
		CallByReferenceTest call = new CallByReferenceTest();
		
		//mehtod의 인자값으로call(Reference DataType)
		call.referenceChange(call);
		System.out.println("call.number:"+call.number);
	}//end of main
}//end of class
