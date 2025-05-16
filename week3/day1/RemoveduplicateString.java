package week3.day1;

import java.util.Arrays;

public class RemoveduplicateString {

	public static void main(String[] args) {
		
		//defining the string
		
		String text="We learn Java basics as part of java sessions in java week";
		
		int count=0;
		
		String str[]=text.split(" ");
		System.out.println("str[]= "+Arrays.toString(str));
		
		//System.out.println(str[5]);
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					str[j]="  ";
					count++;
					//System.out.println(str[i]);
					
				}
			}
		}
		if (count>0) {
			System.out.println("the modified words array where duplicates have been replaced with empty strings");
			
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
