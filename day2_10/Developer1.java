// package jb03.part05;
/*
FileName = Developer1.java

public class Developer1{
	//Field ==> 특성, 속성(attribute) 표현
	String name = "hong gill dong"
	String job ="developer";
	int avglncome=100;
	int projectCarrer;

	//Method ==> 기능, 행위(behavior)표현
	/*
	1.income을 1증가
	2.projectCareer를 1 증가
	*/
	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}
	public void participateProject(String project){
		System.out.println(project+"==>project 참여로 수입증가, 경력 쌓음");
		avlncome++;
		projectCareer++;
	}
	/*
	강의를 통해수입의 증가
	1.income을 1증가
	*/
	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}
	/* ==========추가된 method(OverLoading Method)============
	강의를 통한 수입의 증가
	1. 강의 수에 따라 income을 증가
	*/
	public void instruct(int lectureCount){
		System.out.println(lectureCount+" :개 강의를 통한 수입증가");
		avlncome+=lectureCount;
	}
} / /end of class