package task_21st_june;

import java.util.Scanner;

public class Divisible_5_and_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if((number%5==0) && (number%11==0)) {
				System.out.println( number + " is divisible by 5 and 11");
			}
			else if((number%5 ==0) && ((number%11) != 0)){
				System.out.println( number + " is divisible by 5 and not 11");
			}
			else if((number%5 !=0) && ((number%11) == 0)) {
				System.out.println( number + " is divisible by 11 and not 5");
			}
			else {
				System.out.println(number + " is not divisible by both 5 and 11");
			}
		} 
		else {
			System.out.println("Inavalid input!!. Enter only numbers");
		}
		
		scanner.close();

	}

}
