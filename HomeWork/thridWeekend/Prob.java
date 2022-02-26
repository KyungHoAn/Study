package thridWeekend;

public class Prob {
	private static String[] StringSplit(String str1, String str2) {
		//구현
		
		return null;
	}
	
	//maind method
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = StringSplit(str,"#");
		System.out.println("===문자열 처리 결과===");
		
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
