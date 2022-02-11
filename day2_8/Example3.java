
public class Example3 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum =0;
		int c=0;
		int d=0;

		if(a<b){
			c = a;	// c에 a를 저장
			d = b;	// b를 d에 저장
		}
		else if(a>b){
			c = b;	// c에 a값 저장
			d = a;	// d에 a값 저장
		}
		else{
			System.out.println("같은 값입니다.");
			return;
		}
		
		for(int i=c; i<=d; i++){
			sum+=i;
		}
		System.out.println(a+"~"+b+"의 합은 "+sum+"입니다.");	

		/*
		int c = a;
		a = b;
		b = c;

		// 반복문 한번 사용하여 만들어보기.
		if(a<b){
			for(int i=a; i<=b; i++) {
				sum +=i;
			}
			System.out.println(a+"~"+b+"의 합은"+sum+"입니다.");
		}

		else if(b<a){
			for(int i=b; i<=a; i++){
				sum +=i;
			}
			System.out.println(a+"~"+b+"의 합은"+sum+"입니다.");
		}
		
		else {
			System.out.println("입력값이 같습니다.");
		}

		*/

	} //end of main
}// end of class