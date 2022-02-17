package jb04.part07;

public class Son extends Father {
	//Field
	
	//Constructor
	public Son() {
		System.out.println(this.name); //=>public String name="홍길동";
		System.out.println(bank); //=>protected String bank="한양은행";
		System.out.println(branch); //=>String brach="역삼동 지점"'
		//System.out.println(password); //=>private int password =1234;
		
		//==>Field(상태정보)sms Method(행위)를 이용 접근
		System.out.println("은행 비밀번호:"+this.getPassword(0));
	}
}// end of class

/*
 * 1.private을 사용하여 다른 class로 부터 상태 정보은익
 * 2.method를 통해(행위를 통해)정보은익 여부를 제어
 * */
