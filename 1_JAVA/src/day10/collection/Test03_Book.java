package day10.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03_Book {
	public static void main(String[] args) {
		//List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector<Book>();
		
		list.add(new Book("java",900));
		list.add(new Book("sql",190));
		list.add(new Book("dB",90));
		list.add(new Book("spring",49900));
		list.add(new Book("spring",49900));
		//System.out.println(list);
		
       // list.remove(new Book("sql",190));
		//Collections.sort(list);
		//System.out.println(list);
		
		/*
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).getTitle().charAt(0)+"***");
			System.out.println(list.get(i));
		}
		*/
		
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
            //System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		
		System.out.println(list);
		
		
	}
}


//class Book implements Serializable,Comparable<Book>{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String title;
//	private int price;
//	
//	public Book() {	}
//	
//	public Book(String title, int price) {
//		this.title = title;
//		this.price = price;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		if(title != null && title.length()>0)
//		this.title = title;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		if(price>0)	this.price = price;
//	}
//	
//	public void print() {
//		System.out.printf("BOOk[제목:%s , 가격: %d]%n",title,price);
//	}
//
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", price=" + price + "]";
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		boolean flag = false;
//		
//		if (obj != null && obj instanceof Book) {
//			Book temp = (Book) obj;
//			if(title.equals(temp.title) && price == temp.price) {
//				flag= true;
//			}
//		}
//		
//		return flag;
//	}
//
//	
//	@Override
//	public int compareTo(Book o) {
//		return price-o.price;
//		//return title.compareTo(o.title);
//	}
//
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + price;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}
//
//}
















