package jp03;
import java.io.*;

public class UserVO {
	//Field
	private int no;
	private String name;
	
	//Constructor
	public UserVO() {
		
	}
	public UserVO(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	//method
	//setter method
	public void setName(String name) {
		this.name =name;
	}
	public int getNo() {
		return no;
	}
	//getter mehtod
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserBo[no]");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}//end of class
