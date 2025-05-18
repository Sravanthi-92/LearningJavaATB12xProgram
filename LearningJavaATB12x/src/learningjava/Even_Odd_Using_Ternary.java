package learningjava;

import java.util.Scanner;

public class Even_Odd_Using_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		String result = (num%2 == 0) ? "even" : "odd";
		System.out.println("Entered number is " + result + " number");
		scanner.close();
		
	}

}
