package homework.day24;

public class Prob {
	
	public static String myReplace(String str, char oldChar, char newChar) {
		String arr = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==oldChar) {
				arr+=newChar;
			}else {
				arr+=str.charAt(i);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("---------Sample1----------");
		String str1 = Prob.myReplace("hello word",'l','*');
		System.out.println(str1);
		
		System.out.println("--------Sample2---------");
		String str2= Prob.myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("---------Sample 3---------");
		String str3 = Prob.myReplace("hello world",'a','*');
		System.out.println(str3);
	}
}
