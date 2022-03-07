package weekend.day0305.number02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prob {
	// main mthod
	public static void main(String[] args) throws Exception{
		int[] array = generateRandomNumber();
		printStatistics(array);
	}

	public static int[] generateRandomNumber() {
		// 10개의 중복되지 않는 난수를 생성하여 배열에 저장한 후, 리턴
		Random re = new Random();
		int[] arr = new int[10];
		int range = 20;
		for (int i = 0; i < 10; i++) {
			arr[i] = re.nextInt(range) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		return arr;
	}

	public static void printStatistics(int[] array) throws Exception {
		// 10개의 난수 배열을 매개별수로 하여 발생된 난수와 통계정보를 store.txt파일에 출력
		BufferedWriter bw = new BufferedWriter(new FileWriter("./files/store.txt"));
		List<Integer> list = new ArrayList<Integer>();
		
		for(int arr:array) {
			list.add(arr);
		}
		int max =0;
		int min =0;
		int num=0;
		double avg = 0;
		for(int i=0; i<list.size(); i++) {
			if(max<list.get(i)) {
				max = list.get(i);
				min = max;
			}
			if(min>list.get(i)) {
				min = list.get(i);
			}
			num +=list.get(i);
			avg = num/list.size();
		}
		
		for(int i=0; i<array.length; i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.write("최댓값:"+max+"\n");
		bw.write("최솟값:"+min+"\n");
		bw.write("평균값:"+avg+"\n");
		bw.flush();
		bw.close();
	}

}
