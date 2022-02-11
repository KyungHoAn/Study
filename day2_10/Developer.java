// package jb03.part03;

/*
1.홍길동의 명사화 가능한 것 : attribute==>Field
2. 행위에 해당하는 사항 : behavior ==> Method
*/

public class Developer{
	String name = "hong gill dong";
	String job ="개발자";
	int avglncome =100;
	int projectCareer;		//<=Field 선언만 한 경우(변수를 선언말 한 경우)

	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avglncome++;
		projectCareer++;
	}
	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avglncome++;
	}
}//end of class