package day06;

import util.Calc;
public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setNumber("001");
		a1.setMoney(1000);
		a1.input(9000);
		a1.print();
		
		Account a2 = new Account();
		a2.setNumber("002");
		a2.setMoney(0);
		a2.print();

		Account.transfer(a1, a2, 500);
		a2.print();
		
		int sum = Calc.add(2,4,6,8,10);
	}
}
