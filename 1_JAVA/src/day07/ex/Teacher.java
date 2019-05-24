package day07.ex;

public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age) {
		super(name, age);
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		System.out.printf("이   름 : %s    나 이 : %d     담당과목 : %s\n",
				super.getName(),super.getAge(), subject);
	}
}
