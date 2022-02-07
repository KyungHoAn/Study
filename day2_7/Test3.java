import java.util.Scanner;

public class Test3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a=  stdIn.nextInt();
		int b = stdIn.nextInt();
		
		//a확인
		if(a%2==0){
			if(a%3 == 0) {
				System.out.println("입력하신 1번째 인자값"+a+"는 짝수이며 3의 배수입니다.");
			}else {
				System.out.println("입력하신 1번재 인자값"+a+"는 짝수이며 3의 배수가 아닙니다.");
			}
		}else{
			if(a%3 == 0){
				System.out.println("입력하신 1번째 인자값"+a+"는 홀수이며 3의 배수입니다.");
			}else {
				System.out.println("입력하신 1번재 인자값"+a+"는 홀수이며 3의 배수가 아닙니다.");
			}
		}	

		//b확인
		if(b%2==0){
			if(b%3 == 0) {
				System.out.println("입력하신 2번째 인자값"+b+"는 짝수이며 3의 배수입니다.");
			} else {
				System.out.println("입력하신 2번재 인자값"+b+"는 짝수이며 3의 배수가 아닙니다.");
			}
		} else{
			if(b%3 == 0){
				System.out.println("입력하신 2번째 인자값"+b+"는 홀수이며 3의 배수입니다.");
			}else {
				System.out.println("입력하신 2번재 인자값"+b+"는 홀수이며 3의 배수가 아닙니다.");
			}
		}
	}
}