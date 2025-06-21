package task_17_June;

import java.util.Scanner;

public class Maximum_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");

		if (!scanner.hasNextInt()) {
			System.out.println("enter only numbers");
		}
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if (number1 > number2) {
			System.out.println(number1 + " is greater number than " + number2);

		} else if (number2 > number1) {
			System.out.println(number2 + " is greater number than " + number1);
		} else {
			System.out.println("both are equal");
		}

			scanner.close();

	}

}
