package Task_25_May;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = scanner.nextLine();
		
		String reversed = new StringBuilder(string).reverse().toString();
        System.out.println("Reversed: " + reversed);
        
        if(string.equalsIgnoreCase(reversed)) {
        	System.out.println("Entered string is palindrome");
        }
        else {
        	System.out.println("Entered string is not palindrome");
        }
		
		scanner.close();
		

	}

}
