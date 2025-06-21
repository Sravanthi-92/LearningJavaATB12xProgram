package task_19th_June;

import java.util.Scanner;

public class Grade_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numerical score");
		if (scanner.hasNextInt()) {
			int score = scanner.nextInt();
			if (score <= 100) {

				if (score >= 90 && score <= 100) {
					System.out.println("Grade A+");
				} else if (score >= 80 && score <= 89) {
					System.out.println("Grade A");
				} else if (score >= 70 && score <= 79) {
					System.out.println("Grade B");
				} else if (score >= 60 && score <= 69) {
					System.out.println("Grade C");
				} else if (score >= 50 && score <= 59) {
					System.out.println("Grade D");
				}
				else if(score >= 40 && score <= 49) {
					System.out.println("Grade E");
				}else if(score<40) {
					System.out.println("Fail");
				}
				
			} else {
				System.out.println("Enter only 100 or below");
			}
		}
		else {
			System.out.println("Enter valid input i.e integers only");
		}

		scanner.close();

	}

}
