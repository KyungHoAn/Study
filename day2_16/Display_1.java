//package jb05.part05.test03;

/*
FileName : Display.java
*/
abstract class BusCharge{
	//field
	String section;
	//constructor
	public BusCharge() {
	}
	public BusCharge(String section) {
		this.section = section;
	}
	//method
	public void information() {
		System.out.println("버스요금안내");
	}
	
	//=>사용되지 않으며, 하위클래스에  OverRiding을 강제하는 추상메서드 정의
//	public void charge() {
//		System.out.println("학생:300, 일반인:500. 어르신:공짜");
//	}
	public abstract void charge();
}//end of class

//abstract class상속시 abstract method필히 재정의(OverRiding)해야함 <==강제성
class Student extends BusCharge{
	public Student() {
		super("학생");
	}
	//=>아래의 Mehtod 주석처리하고 컴파일시...컴파일에러를 확인하자
	public void charge() {
		System.out.println("300원");
	}
}//end of class

//abstract class 상속시 abstract method필히 재정의(OverRiding)godigka <=강제성

class Adult extends BusCharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}//end of class

//abstract class 상속시 abstract mehtod필히 재정의(OverRiding)해야함 <==강제성
class Old extends BusCharge{
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("공짜");
	}
}//end of class

public class Display{
	//main method
	public static void main(String args[]) {
		//상위 래퍼런스로 하위 인스턴스를 참조가능(묵시적 형변환/ ~is a ~Relation)
		//abstract class 는 객체 생성불가 그러나 type선언은????
		BusCharge bc1 = new Student();	//Student b1 = new Student();
		BusCharge bc2 = new Adult();	//Adult b2 =new Adult();
		BusCharge bc3 = new Old();	//Old b3 = new Old();
		//=>Polymorphism:하나의 인터페이스로 접근 및 다양한 활용
		
		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();
		
		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();
		
		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();
	}//end of main
}//end of class