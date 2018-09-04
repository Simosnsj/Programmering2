package Lektionsupgifter1;

import java.lang.reflect.Array;
import java.util.Iterator;

public class upgift1 {
	public static void main(String[] args) {
		System.out.println(reverse("HEJ"));
		
	}
	public static int nummersumma(int... nummer) {
		int sum = 0;
		
		for (int i = 0; i < nummer.length; i++) {
			sum += nummer[i];
		}
		return sum;
		
		
		
	}
	
	public static String reverse(String i) {
		
		String rev ="";
		
		if(i.length() == 0){
			return rev;
		}
		else if(i.length()>0) {
			rev+= i.charAt(i.length()-1);
			String rem = "";
			for(int j = 0; j < i.length()-2; j++) {
				rem +=i.charAt(j);
				reverse(rem);
			}
			
		}
		return rev;
		
	}
	
}
