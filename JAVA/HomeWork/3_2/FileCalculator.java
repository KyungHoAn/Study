package homework.day3_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {
	public static void main(String[] args) throws Exception{
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("./files/test.txt");
	}
	
	public void addCalculateResult(String inputFileName) throws Exception{
		List<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		String arr = "";
		while((arr=br.readLine())!=null) {
			list.add(arr);
		}
//		System.out.println(list);
		br.close();
		
		int d = 0;
		int sum =0;
		int result=1;
		for(int i = 0; i<3; i++) {
			d = Integer.parseInt(list.get(i));
//			System.out.println(d);
			sum +=d;
			result *=d;
		}
//		System.out.println(sum);
//		System.out.println(result);
		list.add(Integer.toString(sum));
		list.add(Integer.toString(result));
//		System.out.println(list);
		BufferedWriter bw =new BufferedWriter(new FileWriter(inputFileName));
		
//		for(String i:list) {
//			bw.write(i+"");
//			bw.newLine();
//		}
		for(int i=0; i<list.size(); i++) {
			bw = new BufferedWriter(new FileWriter(list.get(i)));
		}
		bw.flush();
		bw.close();
		
		
//		List<String> list2 = new ArrayList<String>();
//		for(int i=0; i<list.size(); i++) {
//			int b =0;
//			b = Integer.parseInt(list2.get(i));
//			System.out.println(b);
//		}
	}
}
