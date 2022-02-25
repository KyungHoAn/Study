package jp03;
import java.io.*;
/*
 * java.io package:프록램 외부로 지원을 받거나, 전달 경우에 사용
 * 2.keyboard로 부터 data를 읽어 들이면
 */
public class ReaderTest {
	//main mehtod
	public static void main(String[] args) {
		try {
			//inputStream :: 표준 입력장치 추상화한 class
			InputStream inputStream = System.in;
			//inputStream을 Reader로 변경
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("입려을 기다립니다.");
			//값을 읽어드리는 무한loop시작
			while(true) {
				//1.java.io는 지연(block)될 수 있다.
				int i = reader.read();
				char c = (char)i;
				
				//2.java.io는 FIFO구조
				System.out.println("입력하신 값:"+c);
				
				//==>char 'x'가 입력되면 while 종료
				if(c=='x') {
					inputStream.close();
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
