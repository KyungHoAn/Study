package thridWeekend;

public class Prob {
	private static String[] StringSplit(String str1, String str2) {
		//����
		
		return null;
	}
	
	//maind method
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = StringSplit(str,"#");
		System.out.println("===���ڿ� ó�� ���===");
		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
