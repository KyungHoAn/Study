package jb04.part07;

public class Other{
	//Field
	String name = "홍길동";
	String job = new String("Developer");
	//=>위의 String Data Type의 name, job상태값을 정의한 것을 이해한다면
	//=>Other.class Has A String.class(~~Has A~~: Association Relation)
	//=>아래의Father Data Type 과 Other.class간의 관계는
	
	Father owner =new Father(); //==>Father인스턴스 생성
	
	//Constructor
	public Other() {
		System.out.println(this.owner.name);
		System.out.println(owner.bank);
		System.out.println(owner.branch);
		//System.out.println(f.password);
	}
	
}// end of class
/*
 * 1.private를 사용하여 다른 class로 부터 상태 정보은익
 * 2. method를 통해(행위를 통해)정보은익 여부를 제어
