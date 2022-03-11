package thridWeekend;
import java.util.Vector;

public class Prob02 {
	//Field
	//Constructor
	//Mehtod
	public Vector<String> dataChange(String[] strData){
		//아래 구현
		Vector<String> vector = new Vector<String>(10,10);			
		String[] arr = new String[strData.length];
		String[] brr = new String[strData.length];
		
		for(int i=0;i<brr.length; i++) {
			brr[i] = "";
			arr[i]="";
		}
		
		for(int i= 0; i<strData.length; i++) {
			for(int j = strData[i].length()-1; j>=0; j--) {
				arr[i] += strData[i].charAt(j);
			}
		}		
		for(int i=arr.length-1; i>=0; i--) {
			brr[i] += arr[i];
			vector.add(brr[i]);
		}
		
//		vector.removeAll(Arrays.asList("",null));
		
//		for(int j=3; j>=0; j--) {
//			vector.add(strData[j]);
//		}
		
//		for(int i=0; i<strData.length; i++) {
//			vector.add(strData[i]);	
//		}
//		Collections.reverse(vector);
		
		return vector;
	}
	
	//main mehtod
	public static void main(String[] args) {
		Prob02 st = new Prob02();
		String[] strData = {"Java Programming","JDBC","Oravle10g","JSP/Servlet"};
		Vector<String> v = st.dataChange(strData);
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}
}//end of class
