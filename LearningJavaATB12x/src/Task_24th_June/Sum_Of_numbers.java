package Task_24th_June;

import java.util.Scanner;

public class Sum_Of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int sum =0;
		
		for(; number>0; number--) {
			sum = sum+number;
		}
		System.out.println(sum);
		
		scanner.close();

	}

}
