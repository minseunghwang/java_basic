package day10.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book("java",900));
		list.add(new Book("sql",190));
		list.add(new Book("dB",90));
		list.add(new Book("spring",49900));
		list.add(new Book("spring",49900));
		System.out.println(list);
		
        list.remove(new Book("sql",190));
		//Collections.sort(list);
		System.out.println(list);
		
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).getTitle().charAt(0)+"***");
			System.out.println(list.get(i));
		}
		
	}
}


class Book implements Serializable,Comparable<Book>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private int price;
	
	public Book() {	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.length()>0)
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>0)	this.price = price;
	}
	
	public void print() {
		System.out.printf("BOOk[제목:%s , 가격: %d]%n",title,price);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if (obj != null && obj instanceof Book) {
			Book temp = (Book) obj;
			if(title.equals(temp.title) && price == temp.price) {
				flag= true;
			}
		}
		
		return flag;
	}

	@Override
	public int compareTo(Book o) {
		//return price-o.price;
		return title.compareTo(o.title);
	}
}
















