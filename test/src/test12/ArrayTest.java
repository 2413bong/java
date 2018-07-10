package test12;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입력해주세요");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if (num ==1) {
			System.out.println(1);
		}else if (num ==2) {
			System.out.println(2);
		}else if (num ==3) {
			System.out.println(3);
		}else if (num ==4) {
			System.out.println(4);
		}else if (num ==5) {
			System.out.println(5);
		}else {
			System.out.println("");
		System.out.println("니가 입력한 숫자: "+ numStr);
		
		}

}
}

