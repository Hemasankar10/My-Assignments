package week3.day1;

import java.util.Arrays;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		
		String test="I am a software tester";
		
		String rev="";
		
		String a[]=test.split(" ");     //splitting the words in array
		
		System.out.println(Arrays.toString(a));  //printing the splitted array
		
		//traversing each word through loop
		for (int i = 0; i < a.length; i++) {
			
			//finding odd index within the loop
			if (i%2==0) {
				System.out.println(a[i]);
				
			} else {
				char b[]=a[i].toCharArray();
				
				for (int j = b.length-1; j>=0; j--) {
					
					rev=rev+b[j];
					
				}
				System.out.println(rev);
				rev="";

			}
			
		}
		
		

	}

}
