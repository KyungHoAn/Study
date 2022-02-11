//package jb03.part04;
/*
FileName: MethodSyntax.java
*/
public class MethodSyntax{
	//Field
	String name = "hong gill dong";
	String add = "han yang";

	//Method
	//=>브라우저를 켜는 행위정의
	public void browerOn(){
		System.out.println("brower를 켜다");
	}
	//=>작업을 하고 작업 유무를 boolean type으로 return 하는 행위
	public boolean documentWork(){
		System.out.println("document작업을 하고 작업완성 유무를 boolean return");
		return true;
	}
	//=>두개의 정수를 받아 합을 return 하는 행위
	public String getName(){
		System.out.println("이름을 전달합니다.");
		return name;
	}
	//=>주소를 return 하는 행위
	public String getAdd(){
		System.out.println("주소를 전달합니다.");
		return add;
	}
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str= {"hong gill dong","han yang"};
		return str;
	}	
}