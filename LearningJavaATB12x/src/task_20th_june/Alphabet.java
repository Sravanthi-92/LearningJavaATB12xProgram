package task_20th_june;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if(Character.isLetter(str.charAt(0))) {
			System.out.println(str.charAt(0) + " is an alphabet");
		}else {
			System.out.println(str.charAt(0) + " is not an aplhabet");
		}
		
		scanner.close();

	}

}
