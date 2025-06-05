package Task_25_May;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			scanner.close();
			
			if(number<=1) {
				System.out.println( number + " not a prime number");
			}
			else if(number == 2 || number == 3 ) {
				System.out.println(number+  "is a prime number");
			}
			else if((number%2==0) || (number%3==0)) {
				System.out.println( number + " is not a prime number");
			}
			else {
				System.out.println(number + " is a prime number");
			}
			
		}else {
			System.out.println("Enter valid input i.e integer only");
		}

	}

}
