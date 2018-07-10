package test07;

import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		// System.out.println("만드실 배열 갯수를 적으세요");
		// Scanner scan = new Scanner(System.in);
		// String a = scan.nextLine();
		// int size = Integer.parseInt(a);
		// int[] arrNum = new int[size];
		// System.out.println("배열안에 들어갈 숫자를 처음부터 적으세요");
		// for (int i = 0; i < arrNum.length; i++) {
		// String b = scan.nextLine();
		// arrNum[i] = Integer.parseInt(b);
		// scan.close();
		// }
		// System.out.println("배열안에서 2의배수인 숫자는 이것입니다");
		// for (int i = 0; i < arrNum.length; i++) {
		// if (arrNum[i] % 2 == 0) {
		// System.out.print(arrNum[i]);{
		//
		// }
		// }
		// }
		//
		////
//		String[] arrStr = new String[5];
//		arrStr[0] = "a";
//		arrStr[1] = "b";
//		arrStr[2] = "c";
//		arrStr[3] = "d";
//		arrStr[4] = "e";
//		for (int i = 0; i < arrStr.length; i++) {
//			System.out.println(arrStr[i]);
//		}
//	}

	String str = "a/b/c/d/e";
	String[] arrStr = str.split("/");
	for(int i=0;i<arrStr.length;i++) {
		System.out.println(arrStr[i]);
	}
	// String pointData = "50,60,70";

}
}
