package homework.day3_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator.Fitness;

public class Grade {
	public static void main(String[] args) throws IOException {
		Grade grade = new Grade();
		String fileName = "score.txt";
		grade.printGrade(fileName);
	}

	public void printGrade(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		List<String> list = new ArrayList<String>();
		
		int total =0;
		int size=0;
		String arr = "";
		while ((arr = br.readLine()) != null) {
			list.add(arr);
			String[] brr = arr.split(",");
//			System.out.println(brr[1]);
			int num = Integer.parseInt(brr[1]);
			total +=num;
		}
		br.close();		
		
		for(String a : list) {
			System.out.println(a.split(",")[0]+"의 점수는"+a.split(",")[1]+"입니다.");	
			size++;
		}		
		System.out.println("모두의 총점은 "+total+"입니다.");
		System.out.println("모두의 평균은 "+total/size+"점 입니다.");
		
//		System.out.println(list);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i)+"의 점수는"+list+"입니다.");
//		}
	}
}
