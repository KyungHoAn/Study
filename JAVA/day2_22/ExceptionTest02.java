//package jp02;
/*
 * java ExceptionTest 10 20 0�ǻ��� 3��° ���ڰ��� 0�̸� ����� �����߻�
 * ==>��°��(����� ����)�а� ��°�� Ȯ��
 */
public class ExceptionTest02 {
	//Field
	private int sum;
	private int avg;
	
	//Constructor
	public ExceptionTest02() {
		
	}
	//Mehtod
	public void sum(int x, int y) {
		System.out.println("1==> sum ����");
		sum = x+y;
		System.out.println("1==> ��;"+sum);
		System.out.println("1==> sum ��");
	}
	
	//���ڰ����� 0�� ������ ���� �߻�
	public void avg(int z) {
		System.out.println("2==> avg����");
		//try-catch�� JVM���� ������ Exception ��ü�� ó������
		//=>��°���� Ȯ������.
		try {
			avg = sum/z;
		}catch(ArithmeticException e) {
			System.out.println("1.>>================");
			System.out.println("z���� 0�� ����Դϴ�. ������ �Ұ�");
			System.out.println("2.>>================");
			System.out.println(e); //System.out.println(e.toString());
			System.out.println("3.>>================");
			e.printStackTrace();
			System.out.println("4.>>================");			
		}
		System.out.println("��� :"+avg);
		System.out.println("2>===avg��");
	}
	
	//main mehtod
	public static void main(String[] args) {
		int i= Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		ExceptionTest02 et = new ExceptionTest02();
		et.sum(i,j);
		et.avg(k);
		
		System.out.println("main Method End...");
	}//end of main
}//end of class