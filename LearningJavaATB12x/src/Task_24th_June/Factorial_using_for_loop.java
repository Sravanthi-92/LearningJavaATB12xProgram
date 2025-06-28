package Task_24th_June;

import java.util.Scanner;

public class Factorial_using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int factorial = 1;
		
		for(; number>=1; number--) {
			factorial = factorial*number;
		}
		System.out.println(factorial);

	}

}
