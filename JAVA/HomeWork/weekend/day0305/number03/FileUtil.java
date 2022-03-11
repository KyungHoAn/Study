package weekend.day0305.number03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class FileUtil {
	public static void fileToPrint(String fileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		Vector<String> vector = new Vector<String>();
		String arr = "";

		while ((arr = br.readLine()) != null) {
			vector.add(arr);
		}
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		br.close();
	}

	public static Vector<User> fileFindAddres(String fileName, String address) throws Exception {
		// ±¸Çö
		Vector vector = new Vector();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String arr = "";
		Vector vector2 = new Vector();
		while ((arr = br.readLine()) != null) {
			String[] ary = arr.split("/");
			for(String s:ary) {
				vector2.add(s);
			}
			System.out.println(vector2.get(0));
			
			for(int i=0; i<vector2.size();i++) {
				if((vector2.get(1).equals(address))){
					vector.add(vector2.get(i));
				}else {
					
				}
			}
//			vector.add(arr);
		}
		System.out.println(vector.get(0));
		return vector2;
	}// end of class
}
