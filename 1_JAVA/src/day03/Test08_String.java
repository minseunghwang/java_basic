package day03;

public class Test08_String {
	public static void main(String[] args) {
		String msg = "hello java test !!!";
		String msg2 = "";
        StringBuilder sb = new StringBuilder();
		for(int i=0;i<msg.length() ;i++) {
		 // System.out.println(msg.charAt(i)+"=>"+(char)(msg.charAt(i)-32));
		 //msg2 += (char)(msg.charAt(i)-32);  X
		   sb.append((char)(msg.charAt(i)-32));
		}
		
		msg2 = sb.toString();
		
		System.out.println(msg);
		System.out.println(msg2);

		
		
		/*
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(0)+"**");
		System.out.println("**"+name.charAt(name.length()-1));
		System.out.println(name.substring(1, 3));
		*/

	}
}
