
public class Example2 {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		if(num<0 || num>=10){
			System.out.println("1~9값을 입력하세요");
		} else {
			System.out.println(num+"단을 출력합니다.");
			for(int i=1; i<10; i++){
				System.out.println(i+"*"+num+"="+(num*i));
			}
		}
	}
}