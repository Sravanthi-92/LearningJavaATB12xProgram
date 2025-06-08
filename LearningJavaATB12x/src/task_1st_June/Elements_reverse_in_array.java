package task_1st_June;

import java.util.Arrays;
import java.util.Scanner;

public class Elements_reverse_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i =0; i<size; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int j=size-1; j>=0; j--) {
			System.out.println(arr[j]);
		}	
		scanner.close();

	}

}
