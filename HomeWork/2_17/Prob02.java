public class Prob02{
	
	//method
	public void printSeason(int month){
		if(month>12 || month<1) {
			System.out.println("1~12������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ￡ �¾�̳׿�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���� �¾�̳׿�	");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ �¾�̳׿�");
			break;
		default:
			System.out.println("������ �¾�ļ̳׿�");
			break;		
		}
	}

	//main method
	public static void main(String[] args){
		int month = Integer.parseInt(args[0]);
		new Prob02().printSeason(month);
	} // end of main
}//end of class