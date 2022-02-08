
import java.util.Scanner;
public class Example2 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		while(true) {
			if(num<=0 || num>=10)
				System.out.println("다시 입력하세요");
		}
		System.out.println(num+"단을 출력합니다.");
		
		for(int i=1; i<10; i++){
			System.out.println(i+"*"+num+"="+(num*i));
		}
	}
}s