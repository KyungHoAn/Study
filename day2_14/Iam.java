//package jb04.part02;

public class Iam extends Human {
	//Field
	String job;
	
	//Constructor
	public Iam() {
		System.out.println("iam class default Construcotr");
	}
	
	//Method
	//setter method
	public void setJob(String str) {
		job = str;
	}
	//getter method
	public String getJob() {
		return job;
	}
	
	//main mehtod
	public static void main(String[] args) {
		//1.아래의 인스턴스 생성시 출력결과를 확인, 이해하고
		//2.OOP의 일반화관계인 공유(속성,행위)을 OOPL에서 어떻게 지원하는지를 이해할 것.
		//3.아래의 주석을 풀고 속성, 행위의 공유를 확인한다.
		Iam iam = new Iam();
		
		iam.setName("Hong Gill Dong");
		iam.setAge(100);
		iam.setJob("developer");
		
		System.out.println("name:"+iam.getName());
		System.out.println("age:"+iam.getAge());
		System.out.println("jobL"+iam.getJob());
	}// end of main
} // end of class
