package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		//creating int[] array with duplicate data
		int a[]= {2, 5, 7, 7, 5, 9, 2, 3};
		int b[]= {1,8,5,9,3};
		
		//printing array before sorting
		System.out.println("input of a before sorting: "+Arrays.toString(a));
		System.out.println("input of b before sorting: "+Arrays.toString(b));
		
		//sorting both the arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		//printing both arrays after sorting
		System.out.println("input of a after sorting: "+Arrays.toString(a));
		System.out.println("input of b after sorting: "+Arrays.toString(b));
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if (a[i]==b[j]) {
					
					System.out.println(b[j]);
					
				}
			}
		}

	}

}
