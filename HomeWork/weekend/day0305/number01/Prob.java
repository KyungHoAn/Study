package weekend.day0305.number01;

import java.util.Vector;
import java.util.zip.DataFormatException;

public class Prob {
	public static void main(String[] args) {
		Vector bookList = new Vector();
		
		bookList.add(makeBook("Java Programming 기초:컴퓨터:35000"));
		bookList.add(makeBook("초보자를 위한 sQL:컴퓨터:28000"));
		bookList.add(makeBook("HTML5 API 소개: 컴퓨터:58000"));
		//case1
		bookList.add(makeBook("JDBC Programming 기초: 컴퓨터:45000"));
		//case2
		//bookList.add(makeBook(JDBC PRogrammin 기초: 컴퓨터:");
		bookList.add(makeBook("JSP Programming 고급: 컴퓨터:58000"));
		System.out.println("<<책 목록>>");
		printBookList(bookList);
	}
	private static Book makeBook(String bookData) {
		//구현
		String[] arr = bookData.split(":");
		Book book = new Book();
		book.setTitle(arr[0]);
		book.setKind(arr[1]);
		book.setRentalPrice(Integer.parseInt(arr[2]));
		return null;
	}
	
	private static void printBookList(Vector bookList) {
		//구현
		Book book = new Book();
		book.toString();
	}
}
