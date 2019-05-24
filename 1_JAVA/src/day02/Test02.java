package day02;

public class Test02 {

	public static void main(String[] args) {
		double j = Integer.parseInt("90");
		double y = Double.parseDouble("89.9");
        System.out.printf("j=%5.2f , y=%5.2f %n",j,y);
        double temp;
        temp = j;
        j=y;
        y=temp;
        System.out.printf("j=%5.2f , y=%5.2f %n",j,y);
        
		
	}
}
