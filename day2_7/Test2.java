public class Test2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a>b) {
			System.out.printf("첫번재 인수:%d,두번재 인수:%d, %d-%d = %d 입니다.\n",a,b,a,b,a-b);
		} else if(a<b) {
			System.out.printf("첫번재 인수:%d,두번재 인수:%d, %d+%d = %d 입니다.\n",a,b,a,b,a+b);
		}
	}
}