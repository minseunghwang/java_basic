package day07.ex;

public class Test01 {
	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", 22, "행정실");
		e1.print();
		
		Student s1 = new Student("김길동", 20, 1);
		s1.print();
		
		Teacher t1 = new Teacher("고길동", 40, "java ");
		t1.print();
		
		
	}
}
