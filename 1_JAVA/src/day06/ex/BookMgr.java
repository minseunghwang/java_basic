package day06.ex;

public class BookMgr {
	private Book[] bookList;
    int count=0;
	
	public BookMgr() {
		bookList = new Book[3];
	}
	
	public void addBook(Book book) {
		if(count == bookList.length) {
			Book[] temp = new Book[bookList.length *2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList=temp;
		}
		bookList[count]=book;
		count++;
	}
	
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		for(int i=0;i<count;i++) {
			System.out.println(bookList[i].getTitle());
		}
	}
	public void printTotalPrice(){
		System.out.println("=== 책 가격의 총합  ===");
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println("책 가격의 총합 :"+sum);
	}

}
