package test25;

import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("===유저 프로그램 ===");
		System.out.println("1.유저리스트,2.유저생성,3.유저수정,4.유저삭제,q.종료");
		System.out.println("필요하신 명령어를 숫자로 입력해주세요");
		String order = "";
		Controller c = new Controller();
		while(!"q".equals(order)) {
			order = scan.nextLine();
			c.callOrder(order);
			System.out.println("더 하고싶으시다면 계속 명령어를 종료하고싶으시면 q를 눌러주세요");
		}
		System.out.println("===유저 프로그램 종료 ===");
	}
}