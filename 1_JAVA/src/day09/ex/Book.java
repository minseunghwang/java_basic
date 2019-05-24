package day09.ex;

import java.io.Serializable;

public class Book extends Object implements Serializable{
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
}




