package task_20th_june;

import java.util.Scanner;

public class Number_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int reverse = 0;
		int rem;
		if(!scanner.hasNextInt()) {
			System.out.println("Invalid input, Enter number only");
			scanner.next();
			
		}
		int number = scanner.nextInt();
		int num = number;
		while(number!=0) {
			rem = number%10;
			reverse = reverse*10 + rem;
			number= number/10;
		}
		
		if(num == reverse) {
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not a palindrome");
		}
		scanner.close();
		
		         

	}

}
