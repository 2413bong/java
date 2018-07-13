package test07;

import java.util.Scanner;

public class SplitTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�л����� ������  ,�� �����Ͽ� �Է��Ͽ� �ּ���");
		String pointStr = scan.nextLine();
		String[] arrStr = pointStr.split(",");
		int[] arrNum = new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
		}

		for (int i = 0; i < arrNum.length; i++) {
			String str = (i + 1) + "��° �л� :" + arrNum[i];
			System.out.println(str);

		}

		for (int j = 0; j < arrNum.length; j++) {
			for (int k = j + 1; k < arrNum.length; k++) {
				if (arrNum[j] > arrNum[k]) {
					int tmp = arrNum[j];
					arrNum[j] = arrNum[k];
					arrNum[k] = tmp;
					

				}
				for(int i=0;i<arrNum.length;i++) {
				System.out.println(arrNum[i]);	
				
				
			}
		}
		}
	}

}

