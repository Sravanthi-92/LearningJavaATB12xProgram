package task_20th_june;

import java.util.Scanner;

public class Bonus_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int years_of_experience = scanner.nextInt();
		double salary = scanner.nextDouble();
		double bonus;
		if(years_of_experience>0 && salary>0) {
			if(years_of_experience<1) {
				System.out.println("No bonus");
			}
			else if(years_of_experience>=1 && years_of_experience<=3) {
				bonus = salary*(0.05);
				System.out.println(bonus);
			}
			else if(years_of_experience>=4 && years_of_experience<=6) {
				bonus = salary*(0.1);
				System.out.println(bonus);
			}
			else if(years_of_experience>6) {
				bonus = salary*(0.15);
				System.out.println(bonus);
			}
		}
		else {
			System.out.println("Enter years of experience and salary should be greater than zero");
		}
		
		scanner.close();

	}

}
