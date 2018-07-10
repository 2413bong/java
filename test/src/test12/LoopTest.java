package test12;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		String a = scan.nextLine();
		int count = Integer.parseInt(a);
		
		int[] arr = new int[count];
		
		for (int i = 0; i <= (arr.length) * 3; i++) {
			if (i % 3 == 0 && i != 0) {
				arr[(i / 3) - 1] = i;
				System.out.print(arr[(i / 3) - 1] + " ");
			}
			
	
		}
	}
}
