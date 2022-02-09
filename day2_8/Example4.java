
public class Example3 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum =0;
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
		} else {
			System.out.println("입력값이 같습니다.");
		}

	}
}