//package jb05.part03

/*
fileName : ModifierTest03.java
1,TopSecret02.class가 중요한 class라면 modifier를 통해 상속할수 엇ㅂ도록 했으며.
2.secretNo를 readOnly를 명확히 함
3.또한 중요한 class라면 객체 생성을 불가능하게 한다.
==>아래의 coding을 이해하자. 생성자를 외부에서 접근하지 못하기 private선언.
3. static method를 통해 인스턴스를 리턴할 수 있도록 한다.
*/

//final modifier: 상속불가
final class TopSecret04{
	//Field
	//==>access modifier를 활용한 information hiding
	private final int secretNo = 7777;
	
	//Constructor
	//=>Access modifier를 통한 객체생성불가(private constructor을 사용한 이유 이해)
	private TopSecret04() {
		
	}
	//Mehtod
	//getter Method를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd) {
		if(pwd==0) {
			return secretNo;
		}else {
			return 0;
		}
	}
	
	//static method를 이용한 instance retrn 하게 하여 다른 class에서 사용가능하게 함.
	public static TopSecret04 getInstace(int managerNo) {
		if(managerNo == 1234) {
			return new TopSecret04();
		}else {
			return null;
		}
	}
}//end of class
public class ModifierTest04{
	//main method
	public static void main(String[] args) {
		//instance생성 불가로 static method를 통해 인스턴스return 받는다.
		//==>또한 instance를 return받는 경우도 조건(managerNo)을 충족해야함
		
		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));
		//==>ModifierTest01.class~ModifierTest04.class까지 변경하면서
		//=>Access Modifier와 Modifier의 사용, 활용을 이애하잔
	}//end of main
}//end of class