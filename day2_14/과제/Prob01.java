package ex04;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int number = 0;
		int count = 0;
		int sum = 0;

		System.out.println("양의 정수를 입력해주세요:");
		number = stdIn.nextInt();

		for (int i = 0; i < 1000; i += number) {
			count++;
			sum += i;
		}

		System.out.println(number + "의 배수 개수=" + count);
		System.out.println(number + "의 배수 합=" + sum);
	}
}
