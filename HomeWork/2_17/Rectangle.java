//package day17;

public class Rectangle {
	
	//Field
	String color;
	int width;
	int length;
	
	//setter method
	public void setColor(String str) {
		color = str;
	}
	public void setWidth(int str) {
		width = str;
	}
	public void setLength(int str) {
		length = str;
	}
	
	//getter method
	public String getColor() {
		return color;
	}
	public int area() {
		return(width*length);
	}
	public int perimeter() {
		return((2*width)+(2*length));
	}
}//end of class
