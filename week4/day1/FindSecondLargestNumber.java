package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		//declaring array in list
		List<Integer> list=Arrays.asList(3,2,11,4,6,7,19);
		System.out.println("List Before sorting "+list);
		
		//sorting the list
		Collections.sort(list);
		System.out.println("List after sorting "+list);
		
		int result=list.size()-2;
		int secLarNo=list.get(result);
		System.out.println("The second largest number is :"+secLarNo);
	}

}
