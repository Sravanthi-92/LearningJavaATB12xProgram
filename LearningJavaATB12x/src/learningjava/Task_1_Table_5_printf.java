package learningjava;

import java.util.Scanner;

public class Task_1_Table_5_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
        System.out.printf("%d x 1 = %d\n", num, num*1);
        System.out.printf("%d x 2 = %d\n", num, num*2);
        System.out.printf("%d x 3 = %d\n", num, num*3);
        System.out.printf("%d x 4 = %d\n", num, num*4);
        System.out.printf("%d x 5 = %d\n", num, num*5);
        System.out.printf("%d x 6 = %d\n", num, num*6);
        System.out.printf("%d x 7 = %d\n", num, num*7);
        System.out.printf("%d x 8 = %d\n", num, num*8);
        System.out.printf("%d x 9 = %d\n", num, num*9);
        System.out.printf("%d x 10 = %d\n", num, num*10);
        
		scanner.close();

	}

}
