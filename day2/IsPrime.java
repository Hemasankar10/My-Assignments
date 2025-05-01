package week1.day2;


public class IsPrime {

	public static void main(String[] args) {
		int num=13;
		int count=0;
		for (int i = 2; i <=num-1; i++) {
			if (num%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("The number is Prime"+ " "+num);
		}
		else {
			System.out.println("The number is not a Prime"+ " "+num);
		}

	}

}
