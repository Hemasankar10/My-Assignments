package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverseString {

	public static void main(String[] args) {
		
		//declare a string array to the list
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> list=new ArrayList<>(Arrays.asList(arr));
		System.out.println("Strings before sorting"+list);
		
		//sorting the string
		Collections.sort(list);
		System.out.println("Strings after sorting"+list);
		
		
		
		for (int i=list.size()-1; i>=0 ; i--) {
			String rev="";
			rev=rev+list.get(i);
			System.out.println(rev);
		}
		

	}

}
