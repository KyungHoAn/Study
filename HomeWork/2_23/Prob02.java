package homework;

public class Prob02 {
	public String leftPad(String str, int size, char padChar) {
		
		//String num = String.format(str,size).replace(' ', padChar);
		//System.out.println(num.length());
		
		if(str.length()>size) {
			return str;
		}
//		String nu ="";
//		for(int i=str.length(); i<size; i++) {
//			nu+=padChar; 
//		}
		
		return String.format("%"+size+"s",str).replace(' ',padChar);
		
//		return nu+str;
		//return num;
	}
	public static void main(String[] args) {
		Prob02 prob3 = new Prob02();
		
		System.out.println(prob3.leftPad("ABC",6,'#'));
		System.out.println(prob3.leftPad("ABC",5,'$'));
		System.out.println(prob3.leftPad("ABC",2,'&'));
	}//end of main	
}//end of class
