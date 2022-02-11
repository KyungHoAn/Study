//package jb03.part08;
/*
FileName: User01.java
*/
public class User01{
	//Field
	String name = "hong gill dong";
	int javaLevel=0;

	//default Constructor
	//==> 1. ClassName == MethodName
	//==> 2. return Type 없다.
	public User01(){
		System.out.println("Constructor Method");
	}
	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(0{
		return javaLevel;
	}
	
	//Main Method
	public static void main(String[] args){
		System.out.println("===========");
		User01 user = new User01();
		System.out.println("===========");

		//==>출력결과를 확인하고 아래의 주석을 풀어 다시 확인하면...
		/*
		System.out.println("==========");
		User01 user;
		System.out.println("==========");
		user = new User01();
		System.out.println("==========");
		new User01();
		System.out.println("==========");
		*/
		
		System.out.println("name:"+user.getName());
		System.out.println("javaLevel: "+user.getJavaLevel());
	}//end of main
}//end of class