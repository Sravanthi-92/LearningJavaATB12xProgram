package task_1st_June;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Elements_array {

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
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum= sum+arr[i];
		}
		System.out.println(sum + " is the largest element of array");
		scanner.close();

	}

}
