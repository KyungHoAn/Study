package ex04.homework2_28;
import java.io.*;
public class FileController {
	public void reverseLine(String oldf, String newf) throws Exception{
		//reverseLine메소드 구현
		BufferedReader br= null;
		BufferedWriter bw = null;
		
		String oldFile = "";
		String newFile = "";
		
//		Reader r = new InputStreamReader(System.in);
//		br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));//읽기
		
		bw = new BufferedWriter(new FileWriter(oldf)); //쓰기
		
		System.out.println("화일에 저장하실 글을 입력하세요.");
		
		while(true) {
			String str = br.readLine();
			if(str.equals("끝")) {
				break;
			}
			bw.write(str,0,str.length());
			bw.newLine();
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
	public static void main(String[] args) {
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf ="files/newf.txt";
//		c.reverseLine(oldf,  newf);
	}
}
