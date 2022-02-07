import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int a = stdIn.nextInt();

			if(a>=90 && a<=100) {
				System.out.println("수");
				break;
			}else if(a>=80 && a<=89){
				System.out.println("우");
				break;
			}else if(a>=70 && a<=79){
				System.out.println("미");
				break;
			}else if(a>=60 && a<=69){
				System.out.println("양");
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}	
	}
}