package learningjava;

import java.util.Scanner;

public class Categorizing_Using_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		String result = (age<18) ?  "Minor" : ((age>= 65)? "Senior Citizen" : "Adult");
		System.out.println("Entered age is " + result + "'s age");
		scanner.close();
		

	}

}
