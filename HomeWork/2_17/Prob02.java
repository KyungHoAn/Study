public class Prob02{
	
	//method
	public void printSeason(int month){
		if(month>12 || month<1) {
			System.out.println("1~12사이의 숫자만 입력하셔야 합니다.");
			return;
		}
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울에 태어나셨네요");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄에 태어나셨네요	");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름에 태어나셨네요");
			break;
		default:
			System.out.println("가을에 태어냐셨네요");
			break;		
		}
	}

	//main method
	public static void main(String[] args){
		int month = Integer.parseInt(args[0]);
		new Prob02().printSeason(month);
	} // end of main
}//end of class