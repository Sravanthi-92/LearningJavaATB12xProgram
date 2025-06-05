package Task_25_May;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year to check if it is a leap year or not");
		if (scanner.hasNextInt()) {
			int year = scanner.nextInt();
			scanner.close();
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " is a leap year");
			}
			else {
				System.out.println(year + " is not a leap year");
			}
		}else {
			System.out.println("Enter valid input i.e integer only");
		}

	}

}
