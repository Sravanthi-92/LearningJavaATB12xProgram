package Task_25_May;

import java.util.Scanner;

public class FizzBuzz_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			for (int i = 1; i <= number; i++) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("FizzBuzz");
				} else if ((i % 3 == 0) && (i % 5 != 0)) {
					System.out.println("Fizz");
				} else if ((i % 3 != 0) && (i % 5 == 0)) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Enter valid input i.e integer");
		}
		scanner.close();

	}

}
