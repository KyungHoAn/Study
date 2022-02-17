//package day16;

public class Prob02 {
	public int abs(int num1, int num2) {
		//아래에 구현
		int sub = num1 - num2;
		if(sub <0) {
			sub*=-1;
		} else {
			return sub;
		}
		return sub;
	}
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 15;
		
		Prob02 prob = new Prob02();
		System.out.println("두 수의 차는 "+prob.abs(num1,num2));
	}
}
