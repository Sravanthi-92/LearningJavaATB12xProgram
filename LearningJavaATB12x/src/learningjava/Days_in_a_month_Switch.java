package learningjava;

import java.util.Scanner;

public class Days_in_a_month_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month - 1 to 12");
		int month = scanner.nextInt();
		
		
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println("Entered month has 31 days");
		case 4,6,9,11 -> System.out.println("Entered month has 30 days");
		case 2 -> {
		System.out.println("Enter year");
		int year = scanner.nextInt();
		if((year%4==0) && (year%100!=0) ||(year%400==0)) {
		System.out.println("Entered year is a leap year and has 29 days");	
		}
		else {
			System.out.println("Entered year is not a leap year and has 28 days");
		}
		}
		default->
			System.out.println("Enter only from 1 to 12");
		
		}
		scanner.close();	
	}

}
