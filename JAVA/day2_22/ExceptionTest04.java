//package jp02;

public class ExceptionTest04 {
//Field
	private int sum;
	private int avg;
	
	//Constructor
	public ExceptionTest04() {
		
	}
	//Mehtod
	public void sum(int x, int y) {
		System.out.println("1==>sum����");
		sum = x+y;
		System.out.println("1==> ��:"+sum);
		System.out.println("1==> sum ��");
	}
	//JVM���� ���� ArithmethicException�� �ٽ� �ڽ��� ȣ���� ������ ������
	public void avg(int z) throws ArithmeticException{
		System.out.println("2==> avg ����");
		avg = sum/z;
		System.out.println("2==> ���:"+avg);
		System.out.println("2==> avg ��");
	}
	
	//main method
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);
		
		//JVM���� ���� �� program���� throws �ϴ� Exception(����ó��)�� �ذ�å�� try-catch
		
		try {
			et.avg(k);
		}catch(ArithmeticException e) { // ��������� �ּ�ó���ϰ� �Ʒ��� �ּ��� Ǯ�� �����ϸ�..
			//}catch(Exception e){	//Exceptin e = new ArithmeticException()�� �����Ѱ�?
			System.out.println("1>>==================");
			System.out.println("et.avg(k)���� Exception�� �߻��� ���");
			System.out.println("2>>==================");
			System.out.println(e);
			System.out.println("3>>==================");
			e.printStackTrace();
			System.out.println("4>====================");
		}
		System.out.println("main Method End...");
	}//end of main
}// end of class