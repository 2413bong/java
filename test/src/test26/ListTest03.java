package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력해 주세요");
			String name = scan.nextLine();
			System.out.println("나이를 입력해 주세요");
			int age= Integer.parseInt(scan.nextLine());
			Person p = new Person(name, age);
			pList.add(p);
		}
		for (Person n : pList) {
			System.out.println(n);
		}

	}
}
