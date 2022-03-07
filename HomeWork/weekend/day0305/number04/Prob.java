package weekend.day0305.number04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prob {
	//static method
	public static char checkGrade(double avg) {
		//����
		if(avg>=90 && avg<=100) {
			return 'A';
		}else if(avg>=80 && avg<=89) {
			return 'B';
		}else if(avg>=70 && avg<=79) {
			return 'C';
		}else if(avg>=60 && avg<=69) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	//main method
	public static void main(String[] args) throws IOException {
		String stdNum ="";
		int kor =0;
		int math=0;
		int eng =0;
		int java=0;
		int sum =0;
		double avg =0;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�й��� �Է��ϼ���: ");
		stdNum = stdIn.nextLine();
		System.out.print("���� ������ �Է��ϼ���: ");
		kor = stdIn.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		math = stdIn.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng = stdIn.nextInt();
		System.out.print("�ڹ� ������ �Է��ϼ���: ");
		java = stdIn.nextInt();
		
		//����
		sum = kor+math+eng+java;
		avg = (kor+math+eng+java)/4;
		
		Prob prob = new Prob();
		char a = prob.checkGrade(avg);
		
		List<String> list = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("./files/grade.txt"));
		list.add("============");
		list.add("����:"+kor);
		list.add("����:"+math);
		list.add("����:"+eng);
		list.add("�ڹ�:"+java);
		list.add("============");
		list.add("����:"+sum);
		list.add("���:"+avg);
		list.add("����:"+a);
		list.add("============");
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
