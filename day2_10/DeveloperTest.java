//package jb03.part03

/*
FileName:DeveloperTest.java
*/
public class DeveloperTest{
	//Field
	//Method
	//Main Method
	public static void main(String[] args){
		Developer developer = new Developer();

		System.out.println("이름:"+developer.name);
		System.out.println("직업:"+developer.job);
		System.out.println("평균수입은:"+developer.avglncome);
		System.out.println("PTJ경력은:"+developer.projectCareer);

		System.out.println("=================");
		
		//project에 참여
		developer.participateProject();
		System.out.println("평균수입은:"+developer.avglncome);
		System.out.println("project참여 경력은:"+developer.projectCareer);

		System.out.println("===========");

		developer.instruct();
		System.out.println("평균수입은:"+developer.avglncome);
	}
}