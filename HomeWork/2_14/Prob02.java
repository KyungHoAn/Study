//package ex04;

import java.util.Arrays;

public class Prob02 {
	public static void main(String[] args) {
		int[] array = { 3, 24, 1, 55, 17, 43, 5 };

		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]); //마지막 , 없애기

			if(i==array.length-1){
				System.out.print(" ");
			} else {
				System.out.print(",");
			}
		}

//		Arrays.sort(array);
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
	} // end of main
}// end of class
