package task_20th_june;

import java.util.Scanner;

public class Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age of the person");
		int age = scanner.nextInt();
		System.out.println("Enter visa status");
		String visa_status = scanner.next();
		
		if(age>=18 && visa_status.equalsIgnoreCase("valid")) {
			System.out.println("the person can travel");
		}
		else {
			System.out.println("the person cannot travel");
		}
		
		scanner.close();
		

	}

}
