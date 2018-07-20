package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {

	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		HashMap<String, String> userInfo = new HashMap<String, String>();
		userInfo.put("uiName", "ㅁㄴㅇㄹ");
		userInfo.put("uiNum", "3");
		if (udao.deleteUserInfo(userInfo) == 1) {
			System.out.println("삭제 완료!");
		} else {
			System.out.println("삭제 실패!");
		}
		ArrayList<HashMap<String, String>> userList = udao.selectUserInfoList(userInfo);
		for (HashMap<String, String> user : userList) {
			System.out.println(user);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("몇명등록 하실래요?");
		int max = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < max; i++) {
			System.out.println("이름 입력하세요~");
			String name = scan.nextLine();
			System.out.println("나이 입력하세요~");
			String age = scan.nextLine();
			System.out.println("기타사항을 입력하세요~");
			String etc = scan.nextLine();
			userInfo.put("uiName", name);
			userInfo.put("uiAge", age);
			userInfo.put("uiEtc", etc);

			if (udao.insertUserInfo(userInfo) == 1) {
				System.out.println("등록성공");
			} else {
				System.out.println("등록실패");
			}
		}
	}
}
