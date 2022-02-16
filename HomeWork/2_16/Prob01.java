package day16;

import java.util.Scanner;

public class Prob01 {
	// Main Method
	public static void main(String[] args) {
		///
		// int num = Integer.parseInt(args[0]);
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int num = stdIn.nextInt();

		char star = '*';
		String a = " ";

 		for(int i=num; i>0; i-=2) {
			for(int j=0; j<i; j++) {
				System.out.print(star);
			}			
			System.out.println(); //줄바꿈
			for(int b =0; b<1; b) {
				System.out.print(" ");
			}
			//System.out.print(a); //+1식 해서 공백이 1씩 추가되어야 한다.
			
		}
		
		
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<num; j++) {
//				System.out.print(star);
//				
//				if(j == (num-1)) {
//					System.out.println();
//					System.out.print(" ");
//					num-=2;
//				}
//			}
//		}

//		for(int i=0; i<num; i++) {
//			for(int j=num; j>0; j--) {
//			System.out.print(star);
//		}
//			System.out.println(" ");
//		}

//		int i=0;
//		while(num>0) {
//			System.out.print(star);
//			i = num-2;
//		}
	} // end of main
}// end of class
