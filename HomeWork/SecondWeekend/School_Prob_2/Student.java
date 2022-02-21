//package SecondWeekend;

public class Student extends Human{
	private int id;
	
	//Constructor
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	//method
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void print() {
		super.print();
		System.out.println("\t학 번:"+getId());
	}
}
