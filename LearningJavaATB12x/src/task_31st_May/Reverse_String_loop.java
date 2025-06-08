package task_31st_May;

import java.util.Scanner;

public class Reverse_String_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		int length = string.length();
		char arr[] = string.toCharArray();
		for(int i=length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
		scanner.close();

	}

}
