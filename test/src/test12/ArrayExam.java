package test12;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "��°�迭�� ������� ���� �����ÿ�");
			String aa = scan.nextLine();
			int num = Integer.parseInt(aa);
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (arr[i] == (arr[j])) {
					System.out.println("�迭�� ���� �ߺ����� �ʰ� �����ʽÿ�");
					i--;

				}

			}

			scan.close();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
