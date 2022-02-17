//package jb04.part07.outer;

public class Other1{
	//Field
	//==>jb04.part07.Father를 이해할 것.
	jb04.part07.Father unknown = new jb04.part07.Father(); //=>Father인스턴스 생성
	
	//Constructor
	public Other1() {
		System.out.println(this.unknown.name);//=>pubilc String name ="홍길동"
		//System.out.println(f.bank);	//=>protected String bank = "한양은행";
		//System.out.println(f.branch); //=> String branch ="역삼동지점";
		//System.out.println(f.password); //=>private int password =1234;
		
		//=>Field(상태정보)는 Method(행위)를 이용 접근
		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));
	}
}// end of class
