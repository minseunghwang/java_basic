package day08;

import day07.ex.Person;
import day07.ex.Student;

public class Test03 {
	public static void main(String[] args) {
		Object[] obj = {
				new Fish("쿠피"),
				new Dog("시베리안허스키", "케리"),
				"hello java",
				new Student("OOO", 22,1),
				new Student("OOO", 22,2)
				
		};

		for(Object data:obj) {
		   exec(data);
		}
	}
	public static void exec(Object obj) {
		if(obj instanceof Person)
		    ((Person)obj).print();
		if(obj instanceof Animal)
			((Animal)obj).print();
			
	}
}
