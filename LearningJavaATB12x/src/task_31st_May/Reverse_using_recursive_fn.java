package task_31st_May;

import java.util.Scanner;

public class Reverse_using_recursive_fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(reverse(string));
		scanner.close();

	}
	
	public static String reverse(String string) {
		if(string.isEmpty()) {
			return string;
		}else {
			return reverse(string.substring(1)) + string.charAt(0);
		}
		
	}

}
