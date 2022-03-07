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
		//구현
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
		
		System.out.print("학번을 입력하세요: ");
		stdNum = stdIn.nextLine();
		System.out.print("국어 성적을 입력하세요: ");
		kor = stdIn.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		math = stdIn.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		eng = stdIn.nextInt();
		System.out.print("자바 성적을 입력하세요: ");
		java = stdIn.nextInt();
		
		//구현
		sum = kor+math+eng+java;
		avg = (kor+math+eng+java)/4;
		
		Prob prob = new Prob();
		char a = prob.checkGrade(avg);
		
		List<String> list = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("./files/grade.txt"));
		list.add("============");
		list.add("국어:"+kor);
		list.add("수학:"+math);
		list.add("영어:"+eng);
		list.add("자바:"+java);
		list.add("============");
		list.add("총점:"+sum);
		list.add("평균:"+avg);
		list.add("학점:"+a);
		list.add("============");
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
