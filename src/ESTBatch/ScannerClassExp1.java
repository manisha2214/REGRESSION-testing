package ESTBatch;

import java.util.Scanner;

public class ScannerClassExp1 {

	public static void main(String[] args) {
		// read the data from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Anil please enter the first value1:");
		int a = sc.nextInt();
		System.out.println("Shweta please enter the secodn value2:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The total value is:" + c);

	}

}
