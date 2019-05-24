package day10;

public class AccountTest {
	public static void main(String[] args) {
		try {
			Account a1 = new Account("001", 900);
			System.out.println(a1);
		} catch (MoneyException e) {
             System.out.println("a1 "+e.getMessage());
		}
		
		
		try {
			Account a2 = new Account("002", -7000);
			System.out.println(a2);
		} catch (Exception e) {
			System.out.println("a2 "+e.getMessage());
		}
	}
}
