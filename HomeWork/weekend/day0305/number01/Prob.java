package weekend.day0305.number01;

import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {
	public static void main(String[] args) {
		Vector bookList = new Vector();
		
		bookList.add(makeBook("Java Programming ����:��ǻ��:35000"));
		bookList.add(makeBook("�ʺ��ڸ� ���� sQL:��ǻ��:28000"));
		bookList.add(makeBook("HTML5 API �Ұ�: ��ǻ��:58000"));
		//case1
		bookList.add(makeBook("JDBC Programming ����: ��ǻ��:45000"));
		//case2
		//bookList.add(makeBook(JDBC PRogrammin ����: ��ǻ��:");
		bookList.add(makeBook("JSP Programming ���: ��ǻ��:58000"));
		System.out.println("<<å ���>>");
		printBookList(bookList);
	}
	private static Book makeBook(String bookData) {
		//����
		String[] arr = bookData.split(":");
		Book book = new Book();
		book.setTitle(arr[0]);
		book.setKind(arr[1]);
		book.setRentalPrice(Integer.parseInt(arr[2]));
		return null;
	}
	
	private static void printBookList(Vector bookList) {
		//����
		Book book = new Book();
		book.toString();
	}
}
