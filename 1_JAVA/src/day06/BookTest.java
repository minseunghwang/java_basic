package day06;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java");
		b1.setPrice(90);
		
		System.out.println(b1);
		b1.print();
		
		return;
	}
}
