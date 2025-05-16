package week3.day1;

import java.util.Arrays;

public class OddIndexToUppaerCase {

	public static void main(String[] args) {
		
		//defining input string
		String test="changename";
		
		//converting string to chararray
		char[] test1=test.toCharArray();
		
		//printing the char array
		System.out.println("string to chararray= "+Arrays.toString(test1));
		
		for (int i = 0; i < test1.length; i++) {
			
			if (i%2==0) {
				char a=Character.toLowerCase(test1[i]);
				System.out.println(a);
			} else {
				char b=Character.toUpperCase(test1[i]);
				System.out.println(b);
			}
			
		}
		

	}

}
