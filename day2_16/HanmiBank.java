//package jb05.part08;
/*
	filename : HanmiBank.java
*/

public class HanmiBank extends Bank implements Deposit,PayOut{
	//field
	
	//Constructor
	public HanmiBank() {
		
	}
	public HanmiBank(String name) {
		super(name);
	}
	//Mehtod
	public void display() {
		System.out.println("은행명:"+this.getName());
	}
	public void deposit(int money) {
		System.out.println(money+"를 입금합니다.");
	}
	public void payOut(int money) {
		System.out.println(money+"를 출금합니다.");
	}
	
	//main method
	public static void main(String args[]) {
		
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);
		
		//=>interface내부에 선언된 Field의미를 이해하자.
		//interface의 Field를 확인하고...
		System.out.println(Deposit.deposit); //==>static의 접근방식은
		System.out.println(hb.payOut); // =>static 의 접근방식은?
		
		//field의 상태값을 변경해보자
		//Deposit.deposit="입금"
		//PayOut.payOut="출금"
		//=>compile error발생interface에 선언되는 변수는 final static의 특징을 가짐
	}//end of main
}//end of class