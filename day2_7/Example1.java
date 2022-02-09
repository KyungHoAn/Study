public class Example1 {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		if(a>=90 && a<=100) {
			System.out.println("입력하신 값"+a+"점은 수입니다.");
		}else if(a>=80 && a<=89){
			System.out.println("입력하신 값"+a+"점은 우입니다.");
		}else if(a>=70 && a<=79){
			System.out.println("입력하신 값"+a+"점은 미입니다.");
		}else if(a>=60 && a<=69){
			System.out.println("입력하신 값"+a+"점은 양입니다.");
		}else if(a>=0 && a<=59){
			System.out.println("입력하신 값"+a+"점은 가입니다.");

		}else {
			System.out.println("잘못 입력하셨습니다.(0~100입력)");
		}
	}
}