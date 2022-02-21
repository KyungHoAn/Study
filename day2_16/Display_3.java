//package jb05.part07;

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
}//end of class

//charge()를 정의한 interface
//==>기능의 정의(기능만 도출하여 정의한다면...):지하철,항공,택시 요금에도 사용가능
interface Fee{
	public void charge();
}//end of class

//abstract class상속시 abstract method필히 재정의(OverRiding)해야함 <==강제성
class Student extends BusCharge implements Fee{
	public Student() {
		super("학생");
	}
	//=>아래의 Mehtod 주석처리하고 컴파일시...컴파일에러를 확인하자
	public void charge() {
		System.out.println("300원");
	}
}//end of class

//abstract class 상속시 abstract method필히 재정의(OverRiding)godigka <=강제성

class Adult extends BusCharge implements Fee{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}//end of class

//abstract class 상속시 abstract mehtod필히 재정의(OverRiding)해야함 <==강제성
class Old extends BusCharge implements Fee{
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
		//<<구현1>> 아래의 구현은 문제 없이 출력된다.
		
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 =new Old();
		
		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();
		
		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();
		
		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();
		
		//<<구현2>>아래의 구현에서 문제 발생: 컴파일시 에러
		// 하나 : 문제가 발생한 이유
		// 둘:문제를 해결하여 출력이 디ㅗㄹ 수 있도록 구현을 수정할 것
		//==> 힌트:CastingComplete.java의 세번째를 이해하자/ casting연산자를 사용한 이유는?
		/*
		Fee[] fee = new Fee[3];
		fee[0] = new student();
		fee[1] = new Adult();
		fee[2] = new Old();
		
		for(int i=0; i<fee.length; i++) {
			fee[i].information();
			System.out.print(fee[i].section);
			fee[i].charge();
		}
		*/
	}//end of main
}//end of class