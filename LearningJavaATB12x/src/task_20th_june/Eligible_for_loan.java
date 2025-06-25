package task_20th_june;

import java.util.Scanner;

public class Eligible_for_loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();
		int score = scanner.nextInt();
		
		if((age>18 && age>0 && age<80) && (salary>=30000.0) && (score>=650 && score<=850)) {
			System.out.println("Eligible for loan");
		}
		else {
			System.out.println("Not eligible for loan");
		}
		
		scanner.close();

	}

}
