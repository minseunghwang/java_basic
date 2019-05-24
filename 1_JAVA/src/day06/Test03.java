package day06;

public class Test03 {

	public static void main(String[] args) {
        int a=100;
        int b=10;
        
        day06.Test03.max(a,b);
        max(a,b);
        new Test03().min(a, b);
		
	}
    
	public static int max(int a , int b){
		a=1;
		return a>b ? a:b;
	}
	public int min(int a , int b){
		return a<b ? a:b;
	}
}
