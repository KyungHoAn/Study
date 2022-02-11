//package jb03.part06;
/*
FileName: Developer2.java
강의하는 홍길동과, 개발을 병행하는 홍길동을 Object Modeling
1. 홍길동의 명서화 가능한 것 : attribute ==> Field
2. 행위에 해당하는 사항 : behavior ==> Method
3. 참여한 project 의 name을 표기할 수 있는 행위 추가
4. 강의 수에 다른 income의 정도를 명시 할 수 있는 행위 추가

추가적인 사항
 1. Field정보를 return하는 행위를 현한 getter method정의
	(객체의 attrivute는 information hiding(Encapsulation)되어 있으며 
	행위를 통해서 information hiding 되어 있는 정보에 접근할 수 있다.)

OOP의 information hiding 중 종보은익의 개념에서 getter method의 의미를 확인
*/

public class Developer2 {
	//Field ==> 특성., 속성(attrivute)표현
	//private String name = "hong gill dong";
	String name ="hong gill dong";
	String job = "developer";
	int avglncome =100;
	int projectCareer;

	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}

	public void participateProject(String project){
		System.out.println(project+"==> project참여로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}

	public void instruct(int lectureCount){
		System.out.println(letureCount+" : 개 강의를 통한 수입증가");
		avglncome+=lecturecount;
	}

	//추가된 부분
	/*
	상태값을 return하는 행위(getter method)를 정의
	==> 객체는 모든 정보는 Encapsulation되어 있으며
	==> 행위를 통해 Encapsulation되어 있는 상태값에 접근할 수 있다.

	*/
	public String getName(){
		System.out.println("getName() method");
		return name;
	}
	public String getJob(){
		System.out.println("getJob() method");
		return job;
	}
	public String getAvglncome(){
		System.out.println("getAvglncome() method");	
		return avglncome;
	}
	public String getProjectCareer(){
		System.out.println("getprojectCareer() method");
		return projectCareer;
	}// end of main
}//end of class