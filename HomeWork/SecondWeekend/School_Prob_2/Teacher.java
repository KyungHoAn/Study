//package SecondWeekend;

public class Teacher extends Human{
	private String subject;
	
	public Teacher() {
		super();
	}
	public Teacher(String name, int age) {
		super(name, age);
	}
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	//method
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void print() {
		super.print();
		System.out.println("\t 담당과목: "+getSubject());
	}
}
