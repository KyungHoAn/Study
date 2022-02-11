//pakage jb03.part08

/*
FileName: User02.java
*/

public class User02{
	//Field
	String name;
	int javaLevel;

	//Constructor
	public User02(){
		System.out.println("Constructor Method");
		name ="hong gill dong";
		javaLevel=0;
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}

	//Main Method
	public static void main(String[] args){
		System.out.println("===========");
		User02 user = new User02();
		System.out.println("===========");

		System.out.println("name:"+user.getName());
		System.out.println("javaLevel:"+user.getJavaLevel());
	}//end of main
}//end of class