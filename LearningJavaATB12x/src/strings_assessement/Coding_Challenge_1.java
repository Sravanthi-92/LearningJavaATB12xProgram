package strings_assessement;

import java.util.Scanner;

public class Coding_Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int length = string.length();
		string = string.concat("!!");
		char c = string.charAt(0);
		String Arr[] = string.split(" ");
		System.out.println("Length: "+ length + " First char: " + c + " Substring: " + Arr[1]);
		scanner.close();

	}

}
