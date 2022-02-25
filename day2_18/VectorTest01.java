package jp01;
/*
 * VectorTest01.java
 */
import java.util.*;
public class VectorTest01 {
	//Main Method
	public static void main(String[] args) {
		//Vector생성: API의 생성자를 확인, 인자로 전달된 10,10의미 확인
		Vector vector = new Vector(10,10);
		
		//Vector에 Object저장 ==>add(Ovject obj): Object를 인자로 받는다는 의미는?
		String s1 = new String("1.hong");
		vector.add(s1);
		vector.add(new String("2.dong"));
		vector.add("3.님 안녕하세요");
		
		//vector저장된 값을 출력::vector.capacity() 무엇을 return 하는가...
		for(int i=0; i<vector.size(); i++) {
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//String s = (String)vector.elementAt(i);
			System.out.print(s);
//			System.out.print((String)vetor.elementAt(i));
		}
		System.out.println("\n==> API확인");
		vector.insertElementAt("4.길",1);
		for(int i=0; i<vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n==>API확인");
		vector.setElementAt("5.홍길순",3);
		for(int i=0; i<vector.size(); i++) {
			System.out.println((String)vector.elementAt(i));
		}
		
		System.out.println("\n==>API확인");
		vector.removeElementAt(3);
		for(int i=0; i<vector.size(); i++) {
			System.out.print((String)vector.elementAt(i));
		}
	}//end of main
}//end of class
