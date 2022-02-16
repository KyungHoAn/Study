import java.util.Scanner;

public class Prob{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 ");
		int inputInt = stdIn.nextInt();

		if(inputInt<2 && inputInt>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		for(int i=0; i<10 i++){
			System.out.println(inputInt+"*"+(i+1)+"="inputInt*(i+1));
		}
	}
}