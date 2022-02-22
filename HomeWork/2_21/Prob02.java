//package homework2_21;

public class Prob02 {
	
	//main method
	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString ="";

		//프로그램을 구현부 시작
		//참고 문자'a'의 정수값은 97이며 'z'는 122입니다.
//		char c = 'a'; // c에 a저장
//		int i = (int)c; // i에 97저장
//		char c1 = (char)i; //c1에 a저장

	for(int i=0; i<sourceString.length(); i++){
		char member = sourceString.charAt(i);
		if(member == ' '){
			encodedString += ' ';
		} else{
			encodedString +=(char)((int)member+3);
		}
	}
		
//		for(int i=0; i<sourceString.length(); i++){
//			char currentChar = sourceString.charAt(i);
//			if(currentChar ==' '){
//				encodedString +=' ';
//			} else if(currentChar =='x'||currentChar =='y'||currentChar == 'z'){
//				encodedString +=(char)(currentChar-23);
//			}else{
//				encodedString +=(char)(currentChar+3);
//			}
//		}
		
		
//		for(int i=0; i<sourceString.length(); i++) {
//			sourceString.charAt(i);
//		}
//		encodedString = sourceString;

		
		//프로그램 구현부 끝
		System.out.println("암호화할 문자열 "+sourceString);
		System.out.println("암호화된 문자열 "+encodedString);
	}
}
