package weekend2;

import java.util.Scanner;

public class FactorialUtil2 {
	// method
	public static int factorial(int n) {
		int result =1;
		for(int i=1; i<=n; i++) {
			result =1;
			for(int j=2; j<=i; j++) {
				result *=j;
			}
			int s=96;
			char ch = 0;
			for(int a=0; a<i; a++) {
				s++;
				ch = (char)s;
			}
			System.out.println(ch+". "+i+"를 입력한 경우 => 팩토리얼 결과 값 ="+result);
		}
		return result;
	} // end of method

	// main method
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("input	=");

		FactorialUtil2 util = new FactorialUtil2();
		int num = stdIn.nextInt();
		factorial(num);
	}//end of main
}//end of class
