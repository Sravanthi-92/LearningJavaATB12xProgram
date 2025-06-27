package task_21st_june;

import java.util.Scanner;

public class Convert_days_to_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int month = 0;
		int years = 0;
		if(days>365) {
			years = days/365;
			days = days%365;
			if(days>30) {
				month = days/30;
				days = days%30;
				System.out.println(years + " years, " + month + " months and " + days + " days");
			}else {
				System.out.println(years + " years, " + month + " months and " + days + " days");
			}
		}else {
			System.out.println(years + " years, " + month + " months and " + days + " days");
		}
		
		scanner.close();

	}

}
