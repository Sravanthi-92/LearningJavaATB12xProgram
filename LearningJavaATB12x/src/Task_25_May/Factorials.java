package Task_25_May;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		if(!scanner.hasNextInt()) {
			System.out.println("Invalid input, Enter number only");
			scanner.close();
		}
		int n = scanner.nextInt();
		long factorial = 1;
		if(n > Integer.MAX_VALUE) {
			System.out.println("Enter less than " + Integer.MAX_VALUE);
		}
		else if(n<Integer.MIN_VALUE){
			System.out.println("Enter greater than " + Integer.MIN_VALUE);
		}
		else {
			if(n==0) {
				System.out.println("Factorial of "+ n + " is " + factorial);
			}
			else if(n<0) {
				System.out.println("Enter only non-negative values");
			}
			else {
			for(int i=1;i<=n;i++) {
				factorial = factorial*i;
			}
			System.out.println("Factorial of "+ n + " is " + factorial);
			}
		}

	}

}
