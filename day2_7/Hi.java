package jb01.part03;
/*
	FileName : Hi.java
*/
public class Hi{
	public static void main(String[] args){
		System.out.println("1번째 정보: "+args[0]);
		System.out.println("2번째 정보: "+args[1]);
		System.out.println("3번째 정보: "+args[2]);
	}//end of main
}//end of class

/*
	1.compile방법(Console 에서...)
	c://word>javac Hi.java
	==> bytecode생성 Hi.class:확인할 것
	2. 실행 방법
	java Hi홍길동 1234 한양 5678

	==>Hi.class를 실행시 java Hi 후단에 추가적 정보를 입력하면
	==> main method내부에서
	==> 1번째 추가적정보는 :args[0]
	==> 2번째 추가적정보는 :args[1]
	==> 3번째 추가적정보는 :args[2]
	==> 로 받아 처리할 ㅅ 있다.
	3. +(연산자): 문자에 +를 사용하면 append ehlsek
	4. editplus 에서 인자값 받기 설정
	문서/영구적설정/사용자도구/인수내용묻기 check
*/