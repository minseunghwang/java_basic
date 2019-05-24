package day08;

public class Test02 {
	public static void main(String[] args) {
		
		//Animal a = new Animal();
		//Animal[] animals = new Animal[3];
		Animal[] animals = {
				new Fish("쿠피"),
				new Dog("시베리안허스키", "케리")
		};
		
		for(Animal a:animals) {
			exec(a);
		}


	}
	public static void exec(Animal f) {
		f.breath();
		f.print();
	}
}
