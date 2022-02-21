//package jb05.part04.test02;
/*
FileName :Display.java

*/
abstract class BusCharge{
	//field
	String section;
	//Constructor
	public BusCharge() {
		
	}
	public BusCharge(String section) {
		this.section = section;
	}
	//method
	public void information() {
		System.out.println("버스요금안내");
	}
	//==>사용되지 않으며, 하위클래스에 OverRiding을 강제하는 추상메서드정의
//	public void charge() {
//		System.out.println("학생:300,일반인:500, 어르신:공짜");
//	}
	public abstract void charge();
}// end of class

//abstract class상속시 abstract method필히 재정의(OverRiding)해야함 <==강제성
class Student extends BusCharge{
	public Student() {
		super("학생");
	}
	//=>아래의 Method 주석처리하고 컴파일시...컴파일 에러를 확인하자.
	public void charge() {
		System.out.println("300원");
	}
}//end of class

//abstract class 상속시 abstract method필히 재정의(OverRiding)해야함 <==강제성
class Adult extends BusCharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}//end of class

//abstract class 상속시 abstract method필히 재정의(OverRiding)ㅐㅎ야함 <==강제성
class Old extends BusCharge{
	public Old(){
		super("어르신");
	}
	public void charge() {
		System.out.println("공짜");
	}
}//end of class

public class display{
	//main method
	public static void main(String[] args) {
		
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();
		
		b1.information();
		System.out.print(b1.section);
		b1.charge(); // 어떤 클래스의 Mehtod를 호출되었는지 확인하자.
		
		b2.information();
		System.out.print(b2.section);
		b2.charge(); //어떤 클래스의 Mehtod를 호출되었는지 확인하자.
		
		b3.information();
		System.out.print(b3.section);
		b3.charge();//어떤 클래스의 Method를 호출되었는지 확인하자
		
		//=>아래의 주석을 차례로 풀어 컴파일 에러를 확인하자
		//=> 1. abstract class는 객체 생성 불가
		//BusCharge bc01 = new BusCharge();
		
		//==>2. 객체생성은 불가하나, 변수의 선언(Data Type)은 가능하다
		//BusCharge bc02;
	}//end of main
}// end of class