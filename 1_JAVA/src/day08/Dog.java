package day08;
public class Dog extends Animal {
	String kind;
	String name;

	public Dog() {
		super("강아지과");
		// super.kind="강아지";
	}
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		System.out.printf("동물[%s(%s),%s]%n", super.kind, this.kind, name);
	}
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
	
}
