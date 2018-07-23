package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Service {
	public static int max;

	public void delete() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		System.out.println("삭제하실 유저의 이름을 적어주세요");
		boolean aa = false;
		String order = scan.nextLine();
		while (!aa) {
			userInfo.put("uiName", order);
			if (udao.deleteUserInfo(userInfo) == 1) {
				System.out.println("삭제 완료!");
				aa = true;
			} else {
				System.out.println("삭제할 유저의 이름이 없습니다");
				System.out.println("다시 실행하시겠습니까? y/n");
				String bb = scan.nextLine();
				boolean cc = false;
				while (!cc) {
					if (bb.equals("y")) {
						aa = false;
						cc = true;
					} else if (bb.equals("n")) {
						aa = true;
						cc = true;
					} else if (!bb.equals("n") || !bb.equals("y")) {
						System.out.println("y나n으로만 입력해주십시오");
						cc = false;

					}
				}

			}
		}

	}

	public void select() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		ArrayList<HashMap<String, String>> userList = udao.selectUserList();
		ArrayList<HashMap<String, String>> userInfom = udao.selectUser(userInfo);
		System.out.println("1.유저리스트 ,2.유저 정보 검색");
		System.out.println("필요하신 명령어를 숫자로 입력해주세요");
		boolean aa = false;
		while (!aa) {
			String order = scan.nextLine();
			if ("1".equals(order)) {
				System.out.println("유저리스트를 보여드립니다");
				for (HashMap<String, String> user : userList) {
					System.out.println(user);
					aa = true;
				}
			} else if ("2".equals(order)) {
				System.out.println("유저 정보 검색을 시작합니다");
				System.out.println("검색할 유저 이름을 적어주세요");
				String name = scan.nextLine();
				userInfo.put("uiName", name);
				System.out.println(userInfo.get("uiName"));
				aa=true;
			} else {
				System.out.println("존재하지 않는 명령어입니다");
				System.out.println("알맞은 명령어를 입력해주세요");
				aa = false;
			}
		}
	}

	public void insert() {
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명을등록하시겠습니까");
		boolean aa = false;
		while (!aa) {
			try {
				max = Integer.parseInt(scan.nextLine());
				aa = true;
			} catch (Exception e) {
				System.out.println("숫자로만 입력해 주십시오");
				aa = false;
			}
		}

		for (int i = 0; i < max; i++) {
			System.out.print("이름 입력하세요");
			String name = scan.nextLine();
			System.out.print("나이 입력하세요");
			String age = scan.nextLine();
			System.out.print("기타사항 입력하세요");
			String etc = scan.nextLine();
			userInfo.put("uiName", name);
			userInfo.put("uiAge", age);
			userInfo.put("uiEtc", etc);
			if (udao.insertUserInfo(userInfo) == 1) {
				System.out.println("등록 성공!");
			} else {
				System.out.println("등록 실패!");
			}
		}

	}
}
