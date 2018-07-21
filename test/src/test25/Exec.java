package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String aa = scan.nextLine();
		UserDAO udao = new UserDAOImpl();
		System.out.println("유저 정보 저장 프로그램을 실행하겠습니다");
		System.out.println();
		ArrayList<HashMap<String,String>> userList
		=udao.selectUserList();
		for(HashMap<String,String> user:userList) {
			System.out.println(user);
		}
	}

}