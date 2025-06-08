package task_1st_June;

import java.util.Arrays;
import java.util.Scanner;

public class Odd_Even_elements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter size of an array: ");
	    int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array of elements");
		for(int i =0; i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int j=0; j<size; j++) {
			if(arr[j]%2==0) {
				System.out.println(arr[j] + " is an even number");
			}else {
				System.out.println(arr[j] + " is an odd number");
			}
		}
	}

}
