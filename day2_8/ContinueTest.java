//package jb02.part03;
/*
	keyword: continue ==>continue 이후 실행문을 중단, 다시 반복문 실행
*/
public class ContinueTest{
	public static void main(String[] args){
		int inputData = Integer.parseInt(args[0]);

		int sum=0;

		for(int i=0; i<=inputData;i++){
			if(i%2==1){
				continue;	 //홀수이면
			}
			sum = sum+i;
		}
		System.out.println("0~"+inputData+"까지의 짝수의 합은:"+sum);
	}
}