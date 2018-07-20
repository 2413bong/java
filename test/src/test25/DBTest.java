package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTest {
	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;

		int uNum = userList.size()+1;
		try {
			user.put("uNum", uNum+"");
			userList.add(user);
			result = 1;
		} catch (Exception e) {

			System.out.println("지금 코드로 내가 출력될일은 없어");
		}
		return result;
	}

	public static void selectUserList() {
		for(int i = 0 ;i<userList.size();i++) {
			HashMap<String, String> user =userList.get(i);
			System.out.println((i+1) + "번째 유저 정보: " +user);
			
		}

		System.out.println(userList);
	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를 입력해주세요");
		String age = scan.nextLine();		
		hm.put("uName", name);
		hm.put("uAge", age);
		int cnt = insertUser(hm);
		if (cnt == 1) {
			System.out.println("등록성공");
		} else {
			System.out.println("에러");
		}
		
	}
	public static HashMap<String, String> getUser(String uName) {
		for(int i = 0; i <userList.size();i++ ) {
			HashMap<String, String> user = userList.get(i);
			if(user.get("uNum").equals(uName)) {
				return user;
			}
			
		}
		return null;
		
	}
	public static void removeUser(HashMap<String, String> user) {
		userList.remove(user);
	}
	public static void main(String[] args) {
		inputUser();
		inputUser();
		inputUser();
		selectUserList();
		HashMap<String, String> serchUser = getUser("홍길동");
		System.out.println("검색된 유저 : "+ serchUser);
		removeUser(serchUser);
//		selectUserList();
		
		// userList.add(hm);
		// hm= new HashMap<String,String>();
		// System.out.println(userList.size());
		// hm.put("uNum","2");
		// hm.put("uName","MinWoo");
		// hm.put("uAge","25");
		// userList.add(hm);
		//
		// System.out.println(userList);
		// System.out.println();
	}

}
