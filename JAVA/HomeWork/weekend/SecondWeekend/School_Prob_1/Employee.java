//package SecondWeekdend;

public class Employee {
	private String name;
	private int age;
	private String dept;
	
	public Employee() {
		
	}
	public Employee(String n, int a, String d) {
		this.name =n;
		this.age = a;
		this.dept = d;
	}
	public void print() {
		System.out.println("이  름:"+name+"\t나 이:"+age+"\t부  서:"+dept);
	}
	
	//name
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	//age
	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return this.age;
	}
	//dept
	public void setDept(String d) {
		this.dept = d;
	}
	public String getDept() {
		return this.dept;
	}
}
