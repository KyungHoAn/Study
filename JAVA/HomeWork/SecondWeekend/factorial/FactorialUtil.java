package weekend2;
import java.util.Scanner;

public class FactorialUtil {
	//method
	public int factorial(int n) {
		
		int result;
		if(n<2) {
			return 1;
		}
		else {
			result = n*factorial(n-1);
			
			int s=95;
			char ch = 0;
			for(int a=0; a<n; a++) {
				s++;
				ch = (char)s;
			}
			System.out.println(ch+". "+n+"을 입력한 경우 => 팩토리언 결과 값 ="+result /*+"  ("+n+"*"+(n-1)+")" */);
			return result;
		}		
		
	}
	//main method
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("input	=");
		
		FactorialUtil util = new FactorialUtil();		
		System.out.print(util.factorial(stdIn.nextInt()));
	}
}
