package weekend.day0305.number03;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) throws Exception{
		//��(����)������ ���� FileName����
		String pathName = "./files/data.txt";
		
		//data.txt���� ���
		FileUtil.fileToPrint(pathName);
		
		System.out.println("================");
		//data.txt������ ���� ������ �˻�, ����� ���� vector �ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddres(pathName,"����");
		for(int i=0; i<vector.size(); i++) {
			vector.get(i);
		}
		System.out.println("================");
		//data.txt������ ���� ������ �˻�, ����� ���� Vector�ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddres(pathName, "����");
		for(int i=0; i<vector.size(); i++) {
			vector.get(i);
		}
		
		System.out.println("===============");
		//data.txt������ ���� ������ �˻�, �ܷΰ��� ���� Vector�ν��Ͻ� �ޱ�
		System.out.println("ȭ�� ������ ��⵵ ���� �˻�");
		vector = FileUtil.fileFindAddres("./files/data.txt","��⵵");
		for(int i=0; i<vector.size(); i++) {
			//����
			
		}
	}

}
