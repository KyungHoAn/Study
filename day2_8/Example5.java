public class Example5{
	public static void main(String args[]){

		String[][] text = new String[9][9];

		for(int i=1; i<=text.length; i++){
			System.out.println(i+"단을 출력합니다.");
			for(int j=1; j<=text.length; j++){
				text[8][8] = i+"*"+j+"="+i*j;
				System.out.println("text["+(i-1)+"]["+(j-1)+"]:"+text[8][8]);
			} // end of second for
		} // end of first for
	}// end of main
}// end of class