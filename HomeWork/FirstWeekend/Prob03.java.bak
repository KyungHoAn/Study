import java.util.Scanner;

public class Prob03{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1~10 정수 입력:");

		int inputInt = stdIn.nextInt();
	
		if(inputInt<1 || inputInt>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}

		int result =1;
		for(int i=1; i<=inputInt; i++){
			result =1;
			for (int j=2;j<=i ;j++ )
			{
				result*=j;
			}
			System.out.println(i+"!="+result);
		}
	}// end of main
}// end of class