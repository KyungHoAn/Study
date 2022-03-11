//package SecondWeekend;

public class Employee extends Human{
	private String dept;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age) {
		super(name, age);
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	//method
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	public void print() {
		super.print();
		System.out.println("\t부  서"+getDept());
	}
}
