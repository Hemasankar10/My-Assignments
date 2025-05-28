package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		//declaring an int array to list
		List<Integer> list=Arrays.asList(1,2,3,4,10,6,8);
		System.out.println("before sorting"+list);

		//sorting the list
		Collections.sort(list);
		System.out.println("after sorting"+list);
		
		for (int i = 0; i < list.size(); i++) {
			
			int currentNum=list.get(i)+1;
			if (currentNum==list.get(i+1)) {
				continue;
				
			} 
			else {
				System.out.println("Missing element= "+currentNum);

			}
			
		}
	}

}
