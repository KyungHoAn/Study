package homework.day24;

public class ArrayUtil {
	public char[] reverseString(char[] s, int start, int end) {		
		
		char[] a = new char[s.length];
				
		for(int q=0; q<s.length; q++) {
			if(q==start) {
				for(int i=end; i>=start; i--) {
					System.out.print(s[i]);
				}
			}else if(q<=start || q>end){
				System.out.print(s[q]);
			}
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		System.out.println(au.reverseString(s,0,3));
		System.out.println(au.reverseString(s,4,7));
		System.out.println(au.reverseString(s,0,10));
	}
}
