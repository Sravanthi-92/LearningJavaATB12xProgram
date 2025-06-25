package task_20th_june;

import java.util.Scanner;

public class ATM_withdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account balance");
		int cur_bal = scanner.nextInt();
		int amount_withdraw = scanner.nextInt();
		if(amount_withdraw>0 && amount_withdraw%100==0 && amount_withdraw<cur_bal) {
			cur_bal = cur_bal-amount_withdraw;
			System.out.println(cur_bal);
		}
		else {
			System.out.println("Enter valid input");
		}
		scanner.close();
		

	}

}
