package App;

import java.util.List;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class BookApp {
	public static void main(String[] args) {
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		
		BookVO user = new BookVO("spring", "hong", 1200000);
		try {
			service.addBook(user);
		} catch (Exception e) {
			System.out.println("�벑濡� �뜲�씠�꽣 �솗�씤 �븘�슂");
		}
		
		
		if(service != null) {
           List<BookVO> list =  service.bookList();
           list.forEach(i->System.out.println(i));
		}
        
	}
}
