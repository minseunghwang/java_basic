package day09;


public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(4/0);
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나누면 안됨 ... ");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("문자는 안되요.. 숫자만 입력해주세요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println(9);
		}

	}
}
