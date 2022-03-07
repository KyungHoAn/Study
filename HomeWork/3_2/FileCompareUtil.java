package homework.day3_02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {
	public static void main(String[] args) throws Exception  {
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("./files/fstFile1.txt","./files/scdFile1.txt"));
		System.out.println("Successful!!");
	}
	
	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fstFileName));
		List<String> list = new ArrayList<String>();
		
		String arr ="";
		while((arr=br.readLine())!=null) {
			list.add(arr);
		}
//		System.out.println(list);
		br.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));
		List<String> list2 = new ArrayList<String>();
		String brr="";
		while((brr=br2.readLine())!=null) {
			list2.add(brr);
		}
//		System.out.println(list2);
		br2.close();
		
		ArrayList<String> list3 = new ArrayList<String>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(list2.get(i))) {
				
			}else {
				list3.add("\n"+"LINE: "+(i+1)+"  "+list.get(i)+"\n");	
			}
		}
		
		//implements compareFile method
		return list3;
	}
}
