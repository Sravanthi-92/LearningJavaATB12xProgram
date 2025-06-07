package Task_25_May;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			int a =0;
			int b = 1;
			int c = 0;
			System.out.println("Fibanocci series:");
			for(int i=1; i<=number; i++) {
				System.out.println(a);
				c=a+b;
				a=b;
				b=c;
			}
			scanner.close();
		}
		else {
			System.out.println("Enter valid input i.e integers only");
		}

	}

}
