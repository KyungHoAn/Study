public class Bank02{

	//Field (상태)
	int money;
	int balance;
	int command;
	String userName;
	String bankName;

	public Bank02(){
	}
	public Bank02(String s1, String s2, String s3){
	userName = s1;
	bankName =  s2;
	//입금
	}
	public Bank02(String s1, String, s2, String s3){
	userName = s1;
	bankName =s2;
	// 출금
	}
	
	//method
	public void deposit(){
		balance+=money;
		System.out.println(money+"원 입금함.");
	}
	//==>현재의 금액을 display하는 method
	public void displayMoney(){
		System.out.println("현재 잔고는 :"+balance+"입니다.");
	}

	public static void main(String[] args){
		Bank02 bank = new Bank02();
		if(args.length<2){
			System.out.println("인자값이 최소 2개 필요합니다.");
			System.exit(0); //return 하고 같은 의미인지?
		}
		System.out.println(args[0]+"님의 주 거래은행은 "+args[1]+"입니다.");
		
		switch(args.length){
			case 2:
				bank = new Bank02(args[0], args[1]);
				break;
			case 4:
				bank = new Bank02(args[0], args[1]);
				break;
			default:
				System.out.println("인자값이 너무 많습니다");
				break;
		} 
		b.displayMoney();
	}//end of main
}//end of class