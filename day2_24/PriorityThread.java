package jp04;

public class PriorityTread extends Thread{
	//Field
	private String name;
	
	//Constructor
	public PriorityTread() {
		
	}
	public PriorityTread(String name) {
		this.name = name;
	}
	//method
	public void run() {
		for(int i=0; i<3; i++)
			System.out.println(name+"출력");
	}
	public String getThreadName() {
		return name;
	}
	
	//main method
	public static void main(String[] args) {
		PriorityTread p1,p2,p3;
		
		p1 = new PriorityTread("1.우선순위 Max");
		p2 = new PriorityTread("2.우선순위 NORM");
		p3 = new PriorityTread("3.우선순위 MIN");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		//p1.setPriority(8);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("::Main Thread 1EA");
		
		//출력순서를 확인하자 
		p3.start();
		p2.start();
		p1.start();
		System.out.println("::Main Thread 1EA + Thread 3EA");
		
		System.out.println("::"+p1.getThreadName()+"thread의 우선순위:"+p1.getPriority());
		System.out.println("::"+p3.getThreadName()+"thread의 우선쉰위:"+p2.getPriority());
		System.out.println("::"+p3.getThreadName()+"thread의 우선쉰위:"+p3.getPriority());
	}
}
