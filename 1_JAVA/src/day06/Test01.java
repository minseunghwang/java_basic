package day06;

import java.util.Arrays;

import util.Util;

public class Test01 {
	public static void main(String[] args) {
		int[] num1 = {99,44,77,68,80};
        int[] result1 = util.Util.sort(num1); 
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(result1));
		
		
		int[] num2 = {2,3,9,1,7};
		int[] result2 = Util.sort(num2);
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(result2));
		
	}
}
