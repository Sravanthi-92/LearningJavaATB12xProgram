package Task_25_May;

import java.util.Scanner;

public class Reverse_number_using_for {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		
		if(!scanner.hasNextInt()) {
			System.out.println("Invalid input, Enter number only");
			scanner.next();
			
		}
		scanner.close();
		int num = scanner.nextInt();
		//scanner.close();
		int rev = 0;
		if(num==0) {
			System.out.println("reversed number is " + rev);
		}
		else {
			for(; num!=0;num=num/10) {
				rev = rev*10 + (num%10);

			}
			System.out.println("Reverse of entered number is: " + rev);
		}
	

	}

}
