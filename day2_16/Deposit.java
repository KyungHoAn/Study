//package jb05.part08;

/*
FileName : Deposit.java
*/
public interface PayOut{
	//interface Field(memnber variable)==>public static final특성을 갖는다.
	public final static String payOut="출금";
	
	//interface method ==> public abstract 특성을 갖는다
	public abstract void payOut(int moeny);
}// end of class