package Task_24th_June;

import java.util.Scanner;

public class Inverted_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = rows; i >= 1; i--) {

			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		scanner.close();

	}

}
