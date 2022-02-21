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
final class TopSecret03{
	//Field
	//==>access modifier를 활용한 information hiding
	private final int secretNo = 7777;
	
	//Constructor
	//=>Access modifier를 통한 객체생성불가(private constructor을 사용한 이유 이해)
	private TopSecret03() {
		
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
	public static TopSecret03 getInstace() {
		TopSecret03 topSecret = new Topsecret03();
		return topSecret;
		// return new TopSecret03();
	}
}//end of class
public class ModifierTest03{
	//main method
	public static void main(String[] args) {
		//생성자가 private로 instance생성9생성자 호출)불가능
		//TopSecret topSecret = new TopSecret();
		
		//instance생성을 불가로 static method를 통해 객체를 return 받는다
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
	}//end of main
}//end of class