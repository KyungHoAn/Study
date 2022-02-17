//package jb04.part04;

class BusCharge {
	//Field
	String section;
	//Constructor
	public BusCharge(String str) {
		section = str;
	}
	//method
	public void information() {
		System.out.println("버스요금안내");
	}
	public void charge() {
		System.out.println("학생:300, 일반인:500, 어르신:공짜");
	}
} // end of class

class Student extends BusCharge{
	public Student() {
		super("학생");
	}
	public void charge() {
		System.out.println("::300원\n");
	}
}//end of class

class Adult extends BusCharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("::500원\n");
	}
} //end of class

class Old extends BusCharge{
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("::공짜");
	}
}//end of class

public class Display{
	//main Mehtod
	public static void main(String args[]) {
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();
		
		b1.information();
		System.out.print(b1.section);
		b1.charge(); //어던 클래스의 method호출되었는지 확인
		
		b2.information();
		System.out.print(b2.section);
		b2.charge(); //어떤 클래스의 method호출되었는지 확인
		
		b3.information();
		System.out.print(b3.section);
		b3.charge(); // 어떤 클래스의 method호출되었는지 확인
	} // end of main
}//end of class
