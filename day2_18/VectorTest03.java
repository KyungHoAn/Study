package jp01;

import java.util.*;
public class VectorTest03 {
	//main method
	public static void main(String[] args) {
		//Vector객체 생성시 관리(저장, 추출)될 인스턴스 DataType명시
		Vector<String> vector = new Vector<String>(10,10);
		
		//Vector에 String 저장
		//add(E obj): E를 인자로 받는다는 의미는? :: Generic 사용으로 묵시적 형변환 불피요
		String s1 = new String("1.hong");
		vector.add(s1);
		vector.add(new String("2.dong"));
		vector.add("3.님 안녕");
		
		//Vector저장된 값을 출력
		for(int i=0; i<vector.size(); i++) {
			//Generic사용으로 명시적 형변환 불필요
			String s = vector.elementAt(i);
			System.out.print(s);
//			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\nJDK 1.5추가기능::Generic, Enhanced For Loop 사용");
		//==> 위의 for문과 비교하여 이해하자./ JDK 1.5에 추가 기능:: Enhanced For Loop
		//Vector내부에 저장된 값을 size()만큼 반복, 1EA씩 추출 String준다(Generic사용으로..)
		
		for(String value:vector) {
			System.out.println(value);
		}
		
		System.out.println("\n ==> API확인");
		vector.insertElementAt("4.길", 1);
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.elementAt(i));
		}
		System.out.println("\n ==> API확인");
		vector.setElementAt("5.홍길순", 3);
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n ==> API확인");
		vector.removeElement(3);
		for(int i=0; i<vector.size(); i++) {
			System.out.print(vector.elementAt(i));
		}
	}//end of main
}//end of class
