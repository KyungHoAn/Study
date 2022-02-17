package jb04.part07;

public class Father {
	//Field
	public String name = "홍길동";
	protected String bank = "한양은행";
	String branch = "역삼동지점";
	private int password = 1234;
	
	//Constructor
	public Father() {
	}
	
	//Mehtod
	/*
	 * 각각의  Field(상태값)아래의 Method(행위)를 통해 접근이 가능
	 * 아래의 각각의 getter Method의 의미를 이해
	 */
	public String getBank(int pwd) {
		if(pwd!=7777) {
			return "key값을 정확히 입력하세요";
		}else {
			return this.bank;
		}
	}
	//은행비밀번호을 알기우한 key를 알고 있으면password를 return
	public int getPassword(int key) {
		if(key!=7777) {
			return 0;
		}else {
			return this.password;
		}
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
}// end of class
