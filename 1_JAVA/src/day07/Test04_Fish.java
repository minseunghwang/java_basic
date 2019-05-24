package day07;

public class Test04_Fish {
	public static void main(String[] args) {
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리안허스키", "케리");

		
		Animal a = f;
		
		a.breath();
		a.print();
		
	}
}
