package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//defining two input strings
		String text1="stops";
		String text2="potss";
		
		if (text1.length()==text2.length()) {    //condition to check the length of both strings
			
			char name1[]=text1.toCharArray();    //converting string to character array
			char name2[]=text2.toCharArray();    //converting string to character array
			
			//sorting the character array
			Arrays.sort(name1);
			Arrays.sort(name2);
			
			//printing the sorted character array
			System.out.println("after sorting name1: "+Arrays.toString(name1));
			System.out.println("after sorting name1: "+Arrays.toString(name2));
			
			if (Arrays.equals(name1, name2)) {
				System.out.println("The given strings are anagram");
			} 
			else {
				System.out.println("The given strings are not an Anagram");
				
			}
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			

	}

}
}