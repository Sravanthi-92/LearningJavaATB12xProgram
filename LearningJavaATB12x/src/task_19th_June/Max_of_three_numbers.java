package task_19th_June;

import java.util.Scanner;

public class Max_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers");
		if(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if(a>b && a>c) {
				System.out.println(a + " is the maximum number of entered numbers");
			}
			else if(b>a && b>c) {
				System.out.println(b + " is the maximum number of entered numbers ");
			}
			else{
				System.out.println(c + " is the maximum number of entered numbers ");
			}
		}
		else {
			System.out.println("Enter valid input i.e only integers");
		}
		
		scanner.close();

	}

}
