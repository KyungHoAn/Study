import java.util.Scanner;

public class Prob01{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� ");
		int inputInt = stdIn.nextInt();

		if(inputInt<2 && inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}
		
		for(int i=0; i<9; i++){
			System.out.println(inputInt+"*"+(i+1)+"="+(inputInt*(i+1)));
		}
	}
}