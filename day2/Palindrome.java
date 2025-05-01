package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int a=121;
		int count=0;
		int num=a;
		
		for (int i =a ; i!=0; i=i/10) {
			
			int rem = i%10;
			count=count*10+rem;
			System.out.println("Count is"+ " "+count);
			
		}
		if (num==count) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not a Palindrome");
		}
			
		}

	}

