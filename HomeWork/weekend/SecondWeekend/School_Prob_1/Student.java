//package SecondWeekdend;

public class Student {
	private String name;
	private int age;
	private int id;
	
	//Constructor
	public Student() {
	}
	
	public Student(String n, int a, int b) {
		this.name = n;
		this.age = a;
		this.id =b;
	}
	
	public void print() {
		System.out.println("이  름:"+name+"\t나 이:"+age+"\t학  번:"+id);
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
	
	//id
	public void setId(int i) {
		this.id = i;
	}
	public int getId() {
		return this.id;
	}
}
