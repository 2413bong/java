package test08;

import java.util.Scanner;

public class adsasd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�л����� �̸��� , �� �����Ͽ� ��������.");
		String name = scan.nextLine();
		

		String[] arrName = name.split(",");
		int[] score = new int[arrName.length];

		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + "�л��� ������ ��������. : ");
			score[0] = Integer.parseInt(scan.nextLine());
			scan.close();
		}

		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i] + "�л� " + score[i] + "��");
		}
	}
}
