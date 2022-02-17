//package day17;

import java.util.Scanner;

public class TestRectangle {

	// main method
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번재 직사각형의 색깔:");
		rec1.setColor(stdIn.next());

		System.out.println("첫번재 직사각형의 가로:");
		rec1.setWidth(stdIn.nextInt());

		System.out.println("첫번째 직사각형의 세로:");
		rec1.setLength(stdIn.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔:");
		rec2.setColor(stdIn.next());

		System.out.println("두번째 직사각형의 가로:");
		rec2.setWidth(stdIn.nextInt());

		System.out.println("두번째 직사각형의 세로:");
		rec2.setLength(stdIn.nextInt());

		System.out.println(rec1.getColor() + "직사각형의 넓이는" + rec1.area() + "이고 둘레는 " + rec1.perimeter() + "입니다.");
		System.out.println(rec2.getColor() + "직사각형의 넓이는" + rec2.area() + "이고 둘레는" + rec2.perimeter() + "입니다.");

		// TODO 1) 두 직사각형의 넓이를 비교하십시오.
		if (rec1.area() > rec2.area()) {
			System.out.println("넓이는" + rec1.getColor() + "이 더 큽니다.");
		} else if (rec1.area() < rec2.area()) {
			System.out.println("넓이는" + rec2.getColor() + "이 더 큽니다.");
		} else {
			System.out.println("넓이는 같습니다.");
		}

		System.out.println();
		// TODO 2) 두 직사각형의 둘레를 비교하십시오.
		if (rec1.perimeter() > rec2.perimeter()) {
			System.out.println("둘레는" + rec1.getColor() + "이 더 큽니다.");
		} else if (rec1.perimeter() < rec2.perimeter()) {
			System.out.println("둘레는" + rec2.getColor() + "이 더 큽니다.");
		} else {
			System.out.println("둘레는 같습니다.");
		}
	}// end of main
}
