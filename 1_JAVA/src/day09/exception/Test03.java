package day09.exception;

public class Test03 {

	public static void main(String[] args) {
			             //throws InterruptedException {
		System.out.println("strat");

		for(int i=0;i<10;i++) {
			System.out.println("----------------");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("end");
	}
}
