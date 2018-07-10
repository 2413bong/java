package test08;

import java.util.Scanner;

public class adsasd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("학생들의 이름을 , 로 구분하여 적으세요.");
		String name = scan.nextLine();
		

		String[] arrName = name.split(",");
		int[] score = new int[arrName.length];

		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + "학생의 점수를 적으세요. : ");
			score[0] = Integer.parseInt(scan.nextLine());
			scan.close();
		}

		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + "학생 " + score[i] + "점");
		}
	}
}
