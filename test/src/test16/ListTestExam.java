package test16;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTestExam {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < al.size(); i++) {
			System.out.println("리스트에 저장할 문자를 입력해주세요");
			String str = scan.nextLine();
			al.add(str);
		}

		System.out.println("저장한 문자중 찾을 문자를 입력해주세요");
		String str = scan.nextLine();
		int idx = al.indexOf(str);
		if (idx == -1) {
			System.out.println(str + "은 저장한 문자중에 없습니다.");
		} else {
			System.out.println(str + "은 " + idx + "방에 있더라구요");
		}
	}
}
