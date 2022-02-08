import java.util.Scanner;
public class Example3 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int sum =0;
		for(int i=0; i<=b; i++) {
			sum +=i;
		}
		System.out.println(a+"~"+b+"의 합은"+sum+"입니다.");
	}
}