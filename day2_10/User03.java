//pakage jb03.part08;
/*
FileName: User03.java
Constructor
*/

public class User03{
	//Field
	String name;
	int javaLevel;

	//Constructor
	public User03(){
		System.out.println("나는 생성자");
		name = "hong gill dong";
		javaLevel=0;
	}
	//인스턴스 생성시 name상태값을 설정하는 (초기화)생성자
	public User03(String str){
		System.out.println("나는 String을 인자로 받아 name을 초기화하는 생성자");
		name =str;
	}
	//인스턴스 생성시 javaLevel상태값을 설정하는(초기화) 생성자
	public User03(int i){
		System.out.println("나는 int을 인자로 받아 javaLevel을 초기화하는 생성자:");
		javaLevel=1;
	}
	//인스턴스 생성시 name, javaLevel상태값을 설정하는 (초기화) 생성자
	public User03(String str, int i){
		System.out.println("나는 String, int을 인자로 받아 name, javaLevel을 초기화하는 생성자");
		name=str;
		javaLevel=i;
	}

	//Method
	// getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}
	
	//main Method
	public static void main(String[] args){
		//==>각각의 오버로딩된 생성자 호출시 상태값을 출력해보면...
		System.out.println("============");
		User03 user01 = new User03();
		System.out.println("name:"+user01.getName());
		System.out.println("javaLevel:"+user01.getJavaLevel());

		System.out.println("============");
		User03 user02 = new User03("gill soun");
		System.out.println("name:"+user02.getName());
		System.out.println("javaLevel:"+user02.getJavaLevel());

		System.out.println("============");
		User03 user02 = new User03(100);
		//==>상태값을 설정하지 않은(초기화하지않은) name의 출력값은?
		System.out.println("name:"+user03.getName());
		System.out.println("javaLevel:"+user03.getJavaLevel());

		System.out.println("============");
		User03 user04= new User03("이순신",200);
		System.out.println("name:"+user04.getName());
		System.out.println("javaLevel:"+user04.getJavaLevel());
	}//end of main
}//end of class