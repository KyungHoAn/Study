package SecondWeekdend;

public class Prob01 {
	
	//method
	public static void calc(int[] ix) {
		int sum = 0;
		int num =0;
		for(int i = 0; i<ix.length; i++) {
			if(ix[i]%2 ==1) {
				sum +=ix[i];
			}
			if(ix[i]%2==0) {
				num+=ix[i];
			}
		}
		System.out.println("홀수의 합:"+sum);
		System.out.println("짝수의 합:"+num);
	}
	
	//main method
	public static void main(String[] args) {
		int[] ia = new int[] {3,7,1,8,10,2,15,2,10};
		int[] ib = new int[] {1,2,3,4,5};
		
		Prob01 p = new Prob01();
		System.out.println("(배열ia)");
		p.calc(ia);
		System.out.println("(배열ib)");
		Prob01.calc(ib);
	}
}
