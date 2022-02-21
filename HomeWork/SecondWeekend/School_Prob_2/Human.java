//package SecondWeekend;

public class Human{
	private String name;
	private int age;
	
	//Constructor Mehtod
	public Human() {
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return this.age;
	}
	public void print() {
		System.out.print("이름:"+getName()+"\t나이:"+getAge());
	}
//	
//	public static class Student extends Human {
//		private int id;
//		public Student() {
//			super();
//		}
//		public Student(String name, int age) {
//			super(name, age);
//		}
//		public Student(String name, int age, int id) {
//			super(name, age);
//			this.id = id;
//		}
//		
//		//method
//		public void setId(int id) {
//			this.id = id;
//		}
//		public int getId() {
//			return id;
//		}
//		public void print() {
//			//System.out.println("이름: "+getName()+"\t나이: "+getAge()+"\t학  번"+getId());
//			
//			super.print();
//			System.out.println("\t학 번:"+getId());
//		}
//	}
//	
//	static class Teacher extends Human{
//		private String subject;
//		public Teacher(){
//			super();
//		}
//		public Teacher(String name, int age) {
//			super(name,age);
//		}
//		public Teacher(String name, int age, String subject) {
//			super(name, age);
//			this.subject = subject;
//		}
//		
//		//mehtod
//		public void setSubject(String subject) {
//			this.subject = subject;
//		}
//		public String getSubject() {
//			return subject;
//		}
//		public void print() {
//			super.print();
//			System.out.println("\t 담당과목: "+getSubject());
//		}
//	}
//	
//	static class Employee extends Human{
//		private String dept;
//		public Employee() {
//			super();
//		}
//		public Employee(String name, int age) {
//			super(name, age);
//		}
//		public Employee(String name, int age, String dept) {
//			super(name, age);
//			this.dept =dept;
//		}
//		//method
//		public void setDept(String dept) {
//			this.dept = dept;
//		}
//		public String getDept() {
//			return dept;
//		}
//		public void print() {
//			super.print();
//			System.out.println("\t부  서:"+getDept());
//		}
//	}
	
}
