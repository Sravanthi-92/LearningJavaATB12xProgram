package task_19th_June;

import java.util.Scanner;

public class Smallest_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		if(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a<b) {
				System.out.println(a + " is smaller than " + b);
			}
			else {
				System.out.println(b + " is smaller than " + a);
			}
		}
		else {
			System.out.println("enter valid input i.e only numbers");
		}
		
		   

	}

}
