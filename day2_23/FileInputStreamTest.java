package jp03;
import java.io.*;
public class FileInputSteamTest {
	//main method
	public static void main(String[] args) {
		//File을 읽어 들이는 Stream선언
		FileInputStream fis = null;
		//read()수 count 위한 변수
		int readCount=0;
		
		try {
			fis = new FileInputStream(args[0]);
			
			while(true) {
				int i= fis.read();
				
				if(i==-1) {// -1의 의미는 ==API확인
					break;
				}
				char c = (char)i;
				System.out.print(c);
				
				readCount++;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			System.out.println("\n\n=================="	);
			System.out.println("=======>>read횟수 readCount"+readCount);
			System.out.println("=========================");
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main
}//end of class
