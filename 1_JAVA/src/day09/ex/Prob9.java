package day09.ex;

import java.io.File;
import java.util.Scanner;

// Book  toString() , equals(~) 오버라이딩

// BookMgr 
//   Scanner를 이용 "c://lib/bookdata.txt"이파일의 내용을 읽어들여 
//   bookList에 등록 (중복체크)


public class Prob9 {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		//mgr.addBook(new Book("java", 7600));
		
		mgr.printBookList();
		mgr.printTotalPrice();
	}
}
