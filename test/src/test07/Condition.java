package test07;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����1 �Է��� : ");
		String startNum = scan.nextLine();
		System.out.print("����2 �Է��� : ");
		String endNum = scan.nextLine();
		
		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);
		
		if(sNum>eNum) {
			int tmp = sNum;
			sNum = eNum;
			eNum = tmp;
		}
		for(int i=sNum; i<=eNum;i++) {
			System.out.println(i);
		}
		scan.close();
//		
//		System.out.printf("start : %s, end : %s" , startNum, endNum);
//		scan. close();
	}
}
