package jb04.part05;

public class Employee {
	//Field
	String part;
	String name;
	int age;
	int baseSalary;
	
	//Constructor
	public Employee() {
		System.out.println("Emp의  default Constructor");
	}
	public Employee(String name) {
		this.name = name;
		System.out.println("Emp의 name을 받는 Constructor");
	}
	public Employee(String name, String part) {
		this(name);
		this.part = part;
		System.out.println("Emp의 name, part를 받는 Constructor");
	}
	public Employee(String name, String part, int age) {
		this(name, part);
		this.age = age;
		System.out.println("Emp의 name,part,age를 받는 Constructor");
	}
	//Mehtod
	public int salary() {
		System.out.println("Emp의 salay() method");
		baseSalary =100;
		return baseSalary;
	}
}// end of class
