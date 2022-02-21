//package day16;
class TopSecret02{
	//Field
	//==>access modifier를 활용한 information hiding
	//==> private 접근제어를 사용 직접 접글할 수 엇ㅂ도록 하고 getter Mehtod를 통해 접근
	private int secreNo =7777;
	
	//constructor
	public TopSecret02() {
		
	}
	
	//Method
	//getter Method
	//==>method를 통해 조건을 충족할 경우만 secreNo를 return
	public int getSecretNo(int pwd) {
		if(pwd==0) {
			return secretNo;
		}else {
			return 0;
		}
	}
}//end of class

public class ModifierTest02{
	//main method
	public static void main(String[] args) {
		TopSecret02 topSecret = new TopSecret02();
		
		//=>private Field는 information hiding이ㅗ어 있어 접근 및 변경이 불가
		//==>Mehtod를 통해 접근 만 가능/ 변경불가
		//System.out.println(topSecret.secretNo);
		//topsecret.secretNo = 1234;
		
		System.out.println(topSecret.getSecretNo(0));
	}//end of main
}//end of class
