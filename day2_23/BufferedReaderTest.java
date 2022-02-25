package jp03;
import java.io.*;

/*
 * read() Method보다 효율적인 method를 제공하는 class사용
 * 2.Sink stream:DAta를 직접 주고 받는 단순 입출력의 Stream
 */
public class BufferedReaderTest {
//main method
	public static void main(String[] args) throws Exception{
		//read수 count위한 변수
		int readCount =0;
		
		//SinkStream ==> 말단에서 단순 입출력만 담당
		FileReader fr = new FileReader(args[0]);
		//FileterStream ==>추가적인 기능을 제공
		BufferedReader br = new BufferedReader(fr);
		
		//=>위의 두 line과 아래를 비교하자
//		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine(); // API확인
			if(oneLine ==null) {	//API check
				break;
			}
			System.out.println("한줄출력: "+readCount+" "+oneLine);
		}
		//Stream close
		br.close();
		fr.close();
	}//end of main
}
