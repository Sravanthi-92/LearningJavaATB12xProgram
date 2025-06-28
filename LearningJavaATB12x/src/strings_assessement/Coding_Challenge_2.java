package strings_assessement;

import java.util.Scanner;

public class Coding_Challenge_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String string1 = "Hello";
		String string2 = "hello";
		String string3 = "Hello";
		
		System.out.println("equals(): " + string1.equals(string2) + ", equalsIgnoreCase():" + string1.equalsIgnoreCase(string2) + ", compareTo()" + string3.compareTo(string2));
		
		scanner.close();

	}

}
