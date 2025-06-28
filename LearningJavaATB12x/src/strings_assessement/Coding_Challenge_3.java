package strings_assessement;

import java.util.Scanner;

public class Coding_Challenge_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of iterations: ");
        int iterations = scanner.nextInt();
        scanner.close();

        // Test with String
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        long stringTime = end - start;
        System.out.println("String: " + stringTime + "ms");

        // Test with StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        long sbTime = end - start;
        System.out.println("StringBuilder: " + sbTime + "ms");
        
     // Test with StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        long sbfTime = end - start;
        System.out.println("StringBuffer: " + sbfTime + "ms");

	}

}
