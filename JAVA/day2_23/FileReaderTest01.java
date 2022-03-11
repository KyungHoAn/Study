package jp03;

import java.io.*;

public class FileReaderTest01 {
	//main method
	public static void main(String[] args) {
		//File을 읽어 들이는 Stream선언
		FileReader fr = null;
		//read() 수 count위한 변수
		int readCount=0;
		
		try {
			fr = new FileReader(args[0]);
			
			while(true) {
				int i = fr.read();
				
				if(i==-1) {// -1의미 API확인
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
			System.out.println("\n\n===================");
			System.out.println("===========>read횟수:readCount"+readCount);
			System.out.println("===============");
			try {
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

	