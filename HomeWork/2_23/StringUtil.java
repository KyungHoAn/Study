package homework;

public class StringUtil {
	public static void main(String[] args) {
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
	}	
	//
	private static String replaceString(String[] arr) {
		int count=0;
		int max=0;
		int b =0;
		String[] array = new String[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='a') {
					count++;//a
				}
			}			
			if(count>max) {
				max = count;
				count =0;
				 b=i;
			} else {
				count =0;
			}			
		}
		return arr[b].replace('a', 'A');
	}
}