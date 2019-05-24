package day06.ex;

public class Prob6 {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		mgr.addBook(new Book("java", 7600));
		mgr.addBook(new Book("java1", 6600));
		mgr.addBook(new Book("java2", 9600));
		mgr.addBook(new Book("SQL Fundamentals", 1600));
		mgr.addBook(new Book("EJB", 600));
		
		mgr.printBookList();//tostringequals
		mgr.printTotalPrice();
	}
}
