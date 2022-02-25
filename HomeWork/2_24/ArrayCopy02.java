package homework;

import java.util.*;

public class ArrayCopy02 {
//	public Vector<String> moveToVector(String[] datas) {
	public Vector<String> moveToVector(String[] datas) {
//		Vector<String> v = new Vector<String>();
		Vector<String> v = new Vector<String>();
		
		for(int loop = datas.length-1; loop>=0; loop--) {
//			v.addElement(datas[loop]);
			v.add(datas[loop]);
		}
		return v;
	}
	
	//main method
	public static void main(String args[]) {
		ArrayCopy02 ac = new ArrayCopy02();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
//		System.out.println(ac.moveToVector(datas).toString());
		
		List<String> result = ac.moveToVector(datas);
//		List<String> result = ac.moveToVector(datas);
//		System.out.println(result);
//		System.out.println(result.toString());
	}
}
