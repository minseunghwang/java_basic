package day10.collection;

import java.util.HashSet;
import java.util.Set;

public class Test05 {

	public static void main(String[] args) {
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("java",900));
		set.add(new Book("java",900));
		set.add(new Book("sql",190));
		
		Book b1 =  new Book("java",900);
		Book b2 =  new Book("java",900);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		System.out.println(set);
		
		set.forEach(t -> System.out.println(t));
	}

}
