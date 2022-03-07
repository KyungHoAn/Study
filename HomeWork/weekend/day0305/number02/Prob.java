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
		// 10���� �ߺ����� �ʴ� ������ �����Ͽ� �迭�� ������ ��, ����
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
		// 10���� ���� �迭�� �Ű������� �Ͽ� �߻��� ������ ��������� store.txt���Ͽ� ���
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
		bw.write("�ִ�:"+max+"\n");
		bw.write("�ּڰ�:"+min+"\n");
		bw.write("��հ�:"+avg+"\n");
		bw.flush();
		bw.close();
	}

}
