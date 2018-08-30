package Lektionsupgifter1;

import java.lang.reflect.Array;

public class upgift1 {
	public static void main(String[] args) {
		System.out.println(nummersumma(1,2,3));
		
	}
	public static int nummersumma(int... nummer) {
		int sum = 0;
		
		for (int i = 0; i < nummer.length; i++) {
			sum += nummer[i];
		}
		return sum;
		
		
		
	}
}
