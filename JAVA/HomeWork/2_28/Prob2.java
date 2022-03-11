package ex04.homework2_28;

public class Prob2 {
	public static String getParameter(String url, String paramName) {
		//구현
		String[] arr = url.split("&");
//		System.out.println(arr[1]);
		String str = "";		
		String[] brr = arr[1].split("=");
		for(int i=1; i<brr.length; i+=2) {
			str = brr[i];
		}	
		
		return str;
	}
	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("제품 이름: "+prodName);
		
		String url2
		="http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress = getParameter(url2,"address");
		System.out.println("회원 주소: "+userAddress);
	}//end of main
}//end of class
