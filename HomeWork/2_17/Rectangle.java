//package day17;
import java.util.Scanner;

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
	
	//main method
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("ù���� ���簢���� ����:");
		rec1.setColor(stdIn.next());
		
		System.out.println("ù���� ���簢���� ����:");
		rec1.setWidth(stdIn.nextInt());
		
		System.out.println("ù��° ���簢���� ����:");
		rec1.setLength(stdIn.nextInt());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����:");
		rec2.setColor(stdIn.next());
		
		System.out.println("�ι�° ���簢���� ����:");
		rec2.setWidth(stdIn.nextInt());
		
		System.out.println("�ι�° ���簢���� ����:");
		rec2.setLength(stdIn.nextInt());
		
		System.out.println(rec1.getColor()+"���簢���� ���̴�"+rec1.area()+"�̰� �ѷ��� "+rec1.perimeter()+"�Դϴ�.");
		System.out.println(rec2.getColor()+"���簢���� ���̴�"+rec2.area()+"�̰� �ѷ���"+rec2.perimeter()+"�Դϴ�.");
		
		//TODO 1) �� ���簢���� ���̸� ���Ͻʽÿ�.
		if(rec1.area()>rec2.area()) {
			System.out.println("���̴�"+rec1.getColor()+"�� �� Ů�ϴ�.");
		}else if(rec1.area()<rec2.area()){
			System.out.println("���̴�"+rec2.getColor()+"�� �� Ů�ϴ�.");
		}else {
			System.out.println("���̴� �����ϴ�.");
		}
		
		System.out.println();
		//TODO 2) �� ���簢���� �ѷ��� ���Ͻʽÿ�.
		if(rec1.perimeter()>rec2.perimeter()) {
			System.out.println("�ѷ���"+rec1.getColor()+"�� �� Ů�ϴ�.");
		}else if(rec1.perimeter()<rec2.perimeter()){
			System.out.println("�ѷ���"+rec2.getColor()+"�� �� Ů�ϴ�.");
		} else {
			System.out.println("�ѷ��� �����ϴ�.");
		}
	}//end of main
}//end of class
