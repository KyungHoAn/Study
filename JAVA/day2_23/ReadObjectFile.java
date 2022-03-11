package jp03;
import java.io.*;
public class ReadObjectFile {
	//main method
	public static void main(String[] args) throws Exception{
		//1.File에서 instance를 읽을 SinkStream :: FileInputStream생성
		//2. instance를 읽는 FilterStream ::ObjectInputStream생성
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));
		
		UserVO user01 = (UserVO)ois.readObject(); //API확인
		UserVO user02 = (UserVO)ois.readObject(); //API check
		
		System.out.println("1번째 회원정보::"+user01);
		System.out.println("2번째 회원정보::"+user02);
		
		//Stream close();
		ois.close();
	}
}
