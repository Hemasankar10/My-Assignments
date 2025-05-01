package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1;
		int range=8;
		for (int i = 0; i <=range; i++) {
			System.out.println(num1+" ");
			int num3= num1+num2;
            num1=num2;
            num2=num3;
			
		}
	}

}
