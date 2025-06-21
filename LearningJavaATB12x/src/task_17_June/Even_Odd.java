package task_17_June;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if(number%2 ==0) {
				System.out.println( number + " is a even number");
			}else {
				System.out.println(number + " is a odd number ");
			}
		}else {
			System.out.println("enter only a number and integer");
		}
		
		
		scanner.close();

	}

}
