package day10.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		/*
		Set<String> set = new HashSet<String>();
		set.add("hello1");
		set.add("hello3");
		set.add("hello9");
		set.add("hello2");
		set.add("hello2");
        System.out.println(set);
        */
        
		Set<Book> set = new TreeSet<Book>();
		set.add(new Book("java",900));
		set.add(new Book("sql",190));
		set.add(new Book("dB",90));
		set.add(new Book("spring",49900));
		set.add(new Book("spring",49900));
		set.add(new Book("sql",190));
		set.add(new Book("sql",190));
		set.add(new Book("sql",190));

		System.out.println(set);
		
		//for(Book data:set) {
		//	System.out.println(data);
		//}
		
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
            //System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		
		
		set.removeIf(i -> i.getTitle().equalsIgnoreCase("db"));
		System.out.println(set);
	}
}






