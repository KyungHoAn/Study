package jp03;
import java.io.*;
/*
 * ObjectOutputStream을 이용 회원정보를 갖는 UserVO instance를 
 * (객첸ㄴ 상태를 갖는다/ 상태정보를)persistence data(File)로 저장
 */
public class WriteObjectFile {
	//main method
	public static void main(String[] args) throws Exception{
		
		//1.instance를 File에 저장할 SinkStream :: FileOutputStream생성
		//2.instacne를 전송하는FileStream : ObjectOutputStream생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oos.writeObject(new UserVO(1,"홍길동"));//API 확인
		oos.writeObject(new UserVO(2,"홍길순"));//API check
		
		//Stream close()
		oos.close();
	}
}
