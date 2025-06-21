package task_17_June;

import java.util.Scanner;

public class Positivie_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if(number<0) {
				System.out.println(number + " is a negative number");
			}else {
				System.out.println(number + " is not a positive number");
			}
		}else {
			System.out.println("Enter only numbers");
		}
		scanner.close();
	}

}
