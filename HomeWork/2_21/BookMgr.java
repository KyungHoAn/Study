//package homework2_21;

public class BookMgr{
	Book[] booklist = new Book[5];
	private int sum;
	
	public BookMgr() {
		super();
	}
	public BookMgr(Book[] str) {
		booklist = str;
	}
	
	public void printBookList() {
		for(int i=0; i<booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public int printTotalPrice() {
		for(int i=0; i<booklist.length; i++) {
			sum+=booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합:"+sum);
		return sum;
	}
}
