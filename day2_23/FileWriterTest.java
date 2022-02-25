package jp03;
import java.io.*;
public class FileWriterTest {
	//main method
	public static void main(String[] args) throws Exception{
		//필요객체 Stream/ String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		//keyboard로 입력받기위한Sink Stream Reader미
		//1개의 line을 읽기위한readLine() method를 제공하느 BufferedReader생성
		//REader r = new InputStreamReader(System.in);
		//br = new BufferedReader();
		br = new BufferedReader(new InputStreamReader(System.in));
		
		//file에 글을 쓰기 위한 FileWriter및 BufferWriter생성
		//FileWriter fw = new FileWriter("test.txt");
		//bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt")); // api check
		//bw = new BufferedWriter(new FileWriter("test.txt",true); //api check
		
		System.out.println("화일에 저장하실 글을 입력하세요");
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}
			bw.write(str,0,str.length());//api check
			bw.newLine(); // api check
		}
		bw.flush();
		
		//Stream.close()
		br.close();
		bw.close();
	}
}
