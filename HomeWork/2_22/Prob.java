public class Prob{
	public static void printGugudan(int no){
		if(no<1 || no>9){
			System.out.println("1이상 9이하의 값을 입력하셔야 합니다.");
			return;
		}
		for(int i=1; i<10; i++) {
			for(int j=0; j<no; j++){
				System.out.print((j+1)+"*"+i+"="+((j+1)*i)+"   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){

		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("--------------Sample 1--------------------");
		printGugudan(4);

		System.out.println("-------------Sample 2---------------------");
		printGugudan(9);

		System.out.println("---------------Sample 3------------------");
		printGugudan(-1);

		System.out.println("--------------Sample 4-------------------");
		printGugudan(10);
	}
	

}