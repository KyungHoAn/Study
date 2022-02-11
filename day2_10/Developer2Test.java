//package jb03.part06;
/*
FileName: Deverloper2Test.java
*/

public calss Developer2Test{
	//Field
	//method
	// main method
	public static void main(String[] args){
		Developer2 developer = new Developer2();

		System.out.println("이름은:"+developer.name);
		System.out.println("직업은:"+developer.job);
		System.out.println("평균수입은:"+developer.avglncome);
		System.out.println("PJT경력은:"+developer.projectCareer);

		System.out.println("=================");

		//method를 호출하여 행위를 통해 상태값 받아 출력하면

		String name = developer.getName();
		String job= developer.getjob();
		int avglncome = developer.getAvglncome();
		System.out.println("이름은"+name");
		System.out.println("job:"+job);
		System.out.println("avglncome:"+avglncome);
		//아래의 내용을 이해하자.
		System.out.println("평균수입은:"+developer.getProjectCareer());
	} //end of main
}// end of class