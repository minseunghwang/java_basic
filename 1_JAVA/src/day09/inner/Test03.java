package day09.inner;

import day09.Command;

public class Test03 {
	public static void main(String[] args) {
		Command delete = () -> System.out.println("delete 수행 ");
		Command update = ()-> System.out.println("update 수행 ");
		Command list = () -> System.out.println("list 수행 ");
		Command create = () ->System.out.println("create 수행 ");
		
		delete.exec();
		
		
	}
}
