package jp02;

public class OuterClass01 {
//Field
	private String outer = "OuterCalss의 Field";
	
	//Constructor
	public OuterClass01() {
		
	}
	
	//method
	public void outerMethod() {
		System.out.println("::"+this.getClass().getName()+"start..");
		//innerCalss에 접근할 경우 인스턴스 생성 후 접근
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+"end...");
	}
	
	//InnerMember class
	public class InnerClass{
		//Field
		private String inner = "InnerCalss 의 Field";
		//Constructor
		public InnerClass() {
		}
		//method
		public void innerMethod() {
			//innerClass에서 outer class로 접근
			//OuterClass의 Field, Mehtod에 쉽게 접근::레퍼런스 불필요
			System.out.println("==>"+this.getClass().getName()+"start");
			//==>OuterClass의 Field접근 방식::2가지
			System.out.println(outer);
			System.out.println(OuterClass01.this.outer);
			//==>아래의 실행문을 주석 풀면 Compile error가 발생한다. 이유는?
//			System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+"end");
		}
	}
	
	//main method
	public static void main(String[] args) {
		new OuterClass01().outerMethod();
	}//end of main
}//end of class
