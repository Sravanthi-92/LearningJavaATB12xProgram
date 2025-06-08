package task_31st_May;

import java.util.Scanner;

public class First_letter_word_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		String arr[] = string.split(" ");
		int size = arr.length;
		if(size>0) {
			for(int i = 0; i<size; i++) {
				if(!arr[i].isEmpty()) {
					System.out.println(arr[i].charAt(0) + " is the first letter of " + arr[i]);
				}
			}
		}
		else {
			System.out.println("empty string");
		}
		scanner.close();

	}

}
