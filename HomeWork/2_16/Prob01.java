//package day16;

//import java.util.Scanner;

public class Prob01 {
	// Main Method
	public static void main(String[] args) {
		///
		int num = Integer.parseInt(args[0]);
		//Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		//int num = stdIn.nextInt();

		char star = '*';
		String s = " ";
		
 		for(int i=num; i>0; i-=2) {
			for(int j=0; j<i; j++) {
				System.out.print(star);
			}			
			System.out.println(); //
			
			for(int a=num; a>=num; a--) {
				System.out.print(s);
				s +=" ";
			}
		}

//		for(int i=num; i>0; i-=2) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");				
//			}
//			for(int a=0; a<i; i++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		

		
		
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
			
//			for(int a=0; a<num; a++) {
//				System.out.print(" ");
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
