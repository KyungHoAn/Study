//package jb05.part08;

/*fileName : Bank.java
*/
public abstract class Bank{
	//Field
	private String name;
	
	//Constructor
	public Bank() {
	}
	public Bank(String name) {
		this.name=name;
	}
	
	//Mehtod
	//은행명을 출력하는 diplay method를 추상 Mehtod로 정으
	public abstract void display();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//end of class