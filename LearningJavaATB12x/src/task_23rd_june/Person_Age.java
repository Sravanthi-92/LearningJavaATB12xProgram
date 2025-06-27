package task_21st_june;

import java.util.Scanner;

public class Person_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age of person:");
		if(scanner.hasNextInt()) {
			int age = scanner.nextInt();
			
			if(age>0 && age<=12) {
				System.out.println("Child");
			}
			else if(age>=13 && age<=19) {
				System.out.println("Teenager");
			}
			else if(age>=20 && age<=64) {
				System.out.println("Adult");
			}
			else {
				System.out.println("Senior citizen");
			}
		}
		else {
			System.out.println("Enter valid input!!. Only numbers");
		}
		scanner.close();

	}

}
