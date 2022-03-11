package homework.day24;
//import java.util.Arrays;
import java.util.Vector;

public class ArrayCopy01{
	public Vector<String> moveToVector(String[] datas){
		Vector<String> array = new Vector<String>();
//		Vector<String> v = new ArrayList<String>();
				
		String[] arr = new String[datas.length];
		
		System.out.println("입력 배열:");
		for(int i=0; i<datas.length; i++) {
			arr[i] = datas[i];
			
			System.out.print(arr[i]+((datas.length-1)!=i? ",":""));
		}
		System.out.println();
		System.out.println("리턴되는 Vector");
		for(int j=datas.length-1; j>=0; j--) {
			arr[j] = datas[j];
			System.out.print(arr[j]+((datas.length-1)==0 ? "":","));
		}
		
//		Arrays.sort(arr);
		System.out.println();
		
		return array;		
	}
	
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
//		System.out.println(ac.moveToVector(datas).toString());
		
		Vector<String> result = ac.moveToVector(datas);
		System.out.println(result);
		
//		System.out.println(result.toString());
	}
}
