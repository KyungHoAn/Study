package weekend.day0305.number03;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) throws Exception{
		//고객(유저)정보를 갖는 FileName선언
		String pathName = "./files/data.txt";
		
		//data.txt내용 출력
		FileUtil.fileToPrint(pathName);
		
		System.out.println("================");
		//data.txt내용중 서울 거주자 검색, 결과를 담은 vector 인스턴스 받기
		System.out.println("화일 내용중 서울 정보 검색");
		Vector<User> vector = FileUtil.fileFindAddres(pathName,"서울");
		for(int i=0; i<vector.size(); i++) {
			vector.get(i);
		}
		System.out.println("================");
		//data.txt내용중 경주 거주자 검색, 결과를 담은 Vector인스턴스 받기
		System.out.println("화일 내용중 경주 정보 검색");
		vector = FileUtil.fileFindAddres(pathName, "경주");
		for(int i=0; i<vector.size(); i++) {
			vector.get(i);
		}
		
		System.out.println("===============");
		//data.txt내용중 경주 거주자 검색, 겨로가를 담은 Vector인스턴스 받기
		System.out.println("화일 내용중 경기도 정보 검색");
		vector = FileUtil.fileFindAddres("./files/data.txt","경기도");
		for(int i=0; i<vector.size(); i++) {
			//구현
			
		}
	}

}
