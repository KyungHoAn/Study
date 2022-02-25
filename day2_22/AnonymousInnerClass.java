package jp02;

class A {
	// Field
	// Constructor
	// Method
	public void abc(String message) {
		System.out.println("::" + this.getClass().getName() + "start..");
		System.out.println(":: abc()" + message);
		System.out.println(":: " + this.getClass().getName() + "end");
	}
}// end of class

public class AnonymousInnerClass {
	// Main mehtod
	public static void main(String[] args) {
		// 1.인스턴스 생성, 식별성으로 Method접근
		System.out.println("1.============");
		A a = new A();
		a.abc("Hello");

		// 2.인스턴스 생성 후 바로 method접근
		System.out.println("2.============");
		new A().abc("Hello");

		/*
		// 아래 코드를 이해
		public class B extends A {
			public void def(String message) {
				System.out.println(":: HI" + message);
			}
		}
		new B().abc("Hello");
		new B().def("Hello");
*/
		// 3.위의 코드를 이해한다면, 아래의 코드는
		System.out.println("3.===========");
		new A() {
			public void def(String message) {
				System.out.println("::" + this.getClass().getName() + "start..");
				System.out.println("::+def()" + message);
				System.out.println("::" + this.getClass().getName() + "end");
			}
		}.abc("Hello");
		System.out.println("4.============");
		new A() {
			public void def(String message) {
				System.out.println("::" + this.getClass().getName() + "start");
				System.out.println("::def() " + message);
				System.out.println("::" + this.getClass().getName() + "end..");
			}
		}.def("Hello");
	}
}//end of class
