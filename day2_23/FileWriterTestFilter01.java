package jp03;
import java.io.*;
/*
 * ==>FileCopy하는 Application정의
 * keyboard로 FileName을 입력
 */
public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args) throws Exception{
		//필요객체 Stream/String 인스턴스 deciaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName="";
		String copyFileName ="";
		
		int readCount=0; // read를 Count하기위한 변수
		System.out.print("copy할 file이름을 입력하세요:");
		//copy할 File이름 입력
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		//=>원본파일 Data를 read할 수 있는 BufferedReader생성
		br = new BufferedReader(new FileReader(fileName));
		
		//=>사본파일 이름 만들기
		copyFileName = fileName+"_copy";
		//=>data를 write할 수 있는 BufferWrtier생성
		bw = new BufferedWriter(new FileWriter(copyFileName));
		
		//read/writer하는 while문
		String source = null;
		while((source=br.readLine())!=null) {
			bw.write(source);
			readCount++;
		}
		bw.flush();
		
		//Stream close()
		bw.close();
		bw.close();
		
		System.out.println("================");
		System.out.println("==========>read횟수 readCount "+readCount);
		System.out.println("===============");
	}//end of main
}//end of class  
