package Task_24th_June;

import java.util.Scanner;

public class Numbers_10_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		for(;number>0; number--) {
			System.out.println(number);
		}
		
		scanner.close();

	}

}
