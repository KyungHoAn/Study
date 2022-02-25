package jp03;
import java.io.*;
/*
 * byte처리를 위한Stream인 input/output Stream을 이요하여
 * keyboard로 입력, monitor로 출력하는 예
 */
public class WriterTest {
	//main mehtod
	public static void main(String[] args) {
		try {
			//inputStream ::표준 입력장치 추상화한 class
			InputStream inputStream = System.in;
			//문자처리를 위한 Reader로 변경
			Reader reader = new InputStreamReader(inputStream);
			
			//OutputStream :표준출력장치 추상화한 class
			OutputStream outputStream = System.out;
			//문자처리를 위한Writer로 변경
			Writer writer = new OutputStreamWriter(outputStream);
			
			System.out.println("입력을 기다립니다...");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
				writer.flush();
				
				if((char)i == 'x'){
					break;
				}
			}
			
			//==>>while문 내부의 flush()와 밖의flush()의 의미는?
			//w.flush();
			
			//Stream close();
			reader.close();
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
