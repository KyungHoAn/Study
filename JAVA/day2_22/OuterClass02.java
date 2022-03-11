package jp02;

public class OuterClass02 {
//Field
	private String outer = "outerClass 의 Field";
	
	//Constructor
	public void outerMethod() {
		System.out.println("::"+this.getClass().getName()+"start");
		
		final String localVariable = "OuterClass내의 outerMethod의 localVariable";
		
		//Inner local class
		class InnerLocalClass{
			//Field
			private String inner = "innerClass의 Field";
			//Constructor
			public InnerLocalClass() {
				
			}
			//Mehtod
			public void innerMethod() {
				System.out.println("==>"+this.getClass().getName()+"start");
				//innerClass에서 OuterClass로 접근하기
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==>"+this.getClass().getName()+"end");
			}
		}
		
		System.out.println("::"+this.getClass().getName()+"start");
		
		//inner local class를 둘러싼 method에서 인스턴스 생성가능
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();
	}
	
	//main method
	public static void main(String[] args) {
		new OuterClass02().outerMethod();
	}//end of main
}//end of class
