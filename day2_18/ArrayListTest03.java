package jp01;
/*
 * FileName ;ArrayListTest03.java
 * 1. Vactor, ArrayList의 Hierarchy를 보면 두 클래스는 동일 한 공유구조를 갖는다
 * 추후 확습한 Thread의 동기화 부분에서 다른 동작을 한다.
 * 2. Generic
 * ArrayList 생성시 관리한 DataType을 미리 선언 가능
 * Data 추출시 관리한 dataType이 결정되어 있으니 명시적 형변환이 불필요.
 */
import java.util.*;
public class ArrayListTest03 {
	//Main method
	public static void main(String[] args) {
		//ArrayList 생성시 관리(저장, 추출)될 객체의 DataType선언 
		ArrayList<String> arrayList =new ArrayList<String>(10);
		
		//add(E obj) : E를 인자로 받는다는 의미는? :: Generic사용으로 묵시적 형변환 불필요
		String s1 =new String("1.hong");
		arrayList.add(s1);
		arrayList.add(new String("2.길"));
		arrayList.add("3.님 안녕하세요");
		
		//ArrayList저장된 값을 출력
		for(int i=0; i<arrayList.size(); i++) {
			//Generic사용으로 명시적 형변환 불필요
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\nJDK1.5추가기능::Generic, Enhanced For Loop사용");
		//==>위의 for문과 비교하여 이해하자
		//ArrayList내부에 저장된 값을 size()만큼 반복, 1EA씩 추출 String준다
		for(String value: arrayList) {
			System.out.print(value);
		}
		
		System.out.println("\n==>API확인");
		arrayList.add(1,"4.길");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n==> API확인");
		arrayList.set(3, "4.홍길순");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n==? API확인");
		arrayList.remove(3);
		for(int i=0; i<arrayList.size();i++) {
			System.out.print(arrayList.get(i));
		}
	}//end of main
}// end of class
