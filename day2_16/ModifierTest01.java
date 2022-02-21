//package day16;

class TopSecret01{
	//Field
	int secreNo = 7777;
	
	//Constructor
	public TopSecret01() {
		
	}
	
	//Method
	//getter Method
	public int getSecretNo() {
		return secreNo;
	}
}//end of class
public class ModifierTest01 {
	//main mehtod
	public static void main(String[] args) {
		
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secreNo);
		
		//==>secretNo변경하면
		topSecret.secreNo = 1234;
		System.out.println(topSecret.getSecretNo);
	}//end of main
	
}//end of class
/*
 * TopSecret.class의 문제점
 * :secretNo는 중요한 attribute이다 그러나 누구나 접근 및 변경이가능
