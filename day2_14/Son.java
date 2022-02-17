//package jb04.part02;

public class Son extends Iam {
	//Field
	String school;
	
	//Construtor
	public Son() {
		System.out.println("Son class default Constructor");
	}
	
	//Method(setter mehtod)
	public void setSchool(String str) {
		school = str;
	}
	
	//getter method
	public String getSchool() {
		return school;
	}
	
	public static void main(String args[]) {
		//1.아래의 인스턴스 생성시 출력겨로가를 확인, 이해
		//2. OOP의 일반화관계인 공유(속성,행위)을 OOPL에서 어떻게 지원하는지를 이해
		//3. 아래의 주석을 풀고, 속성, 행위의 공유를 확인한다.
		Son son = new Son();
		
		son.setName("홍길동아들");
		son.setAge(50);
		son.setJob("개발자준비중");
		son.setSchool("아이디 교육센터");
		
		System.out.println("name:"+son.getName());
		System.out.println("Age:"+son.geAge());
		System.out.println("job:"+son.getJob());
		System.out.println("job:"+son.getSchool());
	}//end of method
} // end of class
