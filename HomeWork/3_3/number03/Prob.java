package homework.day3_03.number03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator.Fitness;

public class Prob {
	public static void main(String args[]) throws Exception {
		Prob e = new Prob();
		List scores = e.getList();
		for(int i=0; i<scores.size(); i++) {
			System.out.print(scores.get(i));
		}
	}
	
	public List getList() throws Exception {
		//구현
		BufferedReader br = new BufferedReader(new FileReader("./files/list.txt"));
		List<String> list = new ArrayList<String>();
//		Vector<String> vector =new Vector<String>(); 
		
		String pass = "수료";
		String npass="미수료";
		String arr ="";
		
		while((arr=br.readLine())!=null) {
			String[] brr = arr.split("/");
			
			for(String str:brr) {
				list.add(str);
			}

			if("java".equalsIgnoreCase(brr[1]) && Integer.parseInt(brr[2])>=80) {
				list.add(pass+" \n");
			}else if("eql".equalsIgnoreCase(brr[1]) && Integer.parseInt(brr[2])>=90) {
				list.add(pass+" \n");
			}else {
				list.add(npass+" \n");
			}
//			System.out.println(list);
//			for(String brr1:list) {
//				crr=brr1;
//			}
			
		}
//		list.add(crr);
//		System.out.println(list);
//		System.out.println(vector);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}		
		return list;
	}
}
