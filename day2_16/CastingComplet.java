//package jb05.part06;
/*
FileName: Castingcomplet.java
*/

//상위 class Super정의
class Super{
	//Mehtod
	public void a() {
		System.out.println("Super: a()");
	}
}//end of class

//상위 class super를 상속 받는 하위 class sub정의
class Sub extends Super{
	//mehtod
	public void a() {
		System.out.println("oberriding된 Sub: a()");
	}
	public void b() {
		System.out.println("sub: b()");
	}
}//end of class

public class CastingComplete{
	//main Mehtod
	public static void main(String args[]) {
		//하나: 상위class인스턴스 생성(Data type== 인스턴스의 경우)
		System.out.println("\n여기는 Super s1= new Super()부분");
		Super s1 = new Super();
		s1.a();
		
		//둘: 하위  class인스턴스 생성(Data type== 인스턴스의 경우)
		System.out.println("\n여기는 Sub s2= new Sub()부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();
		
		//셋: 상위 data type으로 하위 인스턴스 생성(Data type!=인스턴스)
		System.out.println(" \n여기는 Sub s3 =new Sub()부분");
		Super s3 = new Sub(); //<=묵시적 형변환
		s3.a();
		//아래의 사항은 error가 발생한다. s3는 b()를 참조할 수 없다(꼭 이해)!
		
		//s3.a()를 사용하려면 ==> casting 연산자 사용(즉 자신의 원상태복귀(?))
		System.out.println("\ns3는 b(0에 접근 불가하다");
		System.out.println("casting연산자를 이용 Subsub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3;
		sub.b();
		
		//넷:하위 datatype으로 상위 인스턴스 생성(Data Type!=인스턴스)
		//error부위(하위레ㅠㅓ런스변수는 상위인스턴스를 레퍼런스할수 없다.)
		//Sub s4 =new Super();
		
	}
}