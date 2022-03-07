//package SecondWeekdend;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {
		
	}
	public Teacher(String n, int a, String s) {
		this.name = n;
		this.age =a;
		this.subject = s;
	}
	
	public void print() {
		System.out.println("이  름:"+name+"\t나 이:"+age+"\t담당과목:"+subject);
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
	
	//subject
	public void setSubject(String s) {
		this.subject = s;
	}
	public String getSubject() {
		return this.subject;
	}
}
