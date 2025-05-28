package week4.day1;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
//import java.util.stream.Collectors;

public class IntersectionUsingList {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(3,2,11,4,6,7);
		List<Integer> list2=Arrays.asList(1,2,4,8,9,7);
		System.out.println(list1);
		System.out.println(list2);
		
		for (Integer intersection : list2) {
			if (list1.contains(intersection)) {
				System.out.println("The intersection elements of two lists are: "+intersection);
			}
			
		}
		
	}

}



// another method for finding intersection element is by converting list to set
		/*Set<Integer> set1= new TreeSet<>(list1);
		Set<Integer> set2= new TreeSet<>(list2);
		
		//intersection of two sets
		set1.retainAll(set2);
		if (set1.isEmpty()) {
			System.out.println("No intersection");
			
		} else {
			System.out.println("intersection Element: "+set1);
		}*/