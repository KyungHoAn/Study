public class Prob02{
	public static void main(String[] args){
		int limit =50;
		boolean prime = false;
		
		for(int i=2; i<limit; i++){
			prime =true;
			for(int j=2; j<i; j++){
				if(i%j==0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}

		/*
		for(int i=2; i<limit; i++){
			if(i%2==1){
				if(i%3==1 || i%3==2){
					if(i%5 !=0 && i%7!=0){
						System.out.println(i);
					}
				}
			}
		}
		*/
	} // end of main
} //end of class