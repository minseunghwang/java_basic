package day07;

public class Animal extends Object{
	String kind = "동물의 종류";

	public Animal() {
		super();
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
	public void print(){ }
}
class Dog extends Animal{
	String kind;
	String name;
	public Dog() {
		super("강아지과");
		//super.kind="강아지";
	}
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		System.out.printf("동물[%s(%s),%s]%n",super.kind,this.kind,name);
	}
}


