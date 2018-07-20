package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	private static ArrayList<HashMap<String, String>> menuList = new ArrayList<HashMap<String, String>>();

	public static int insertMenu(HashMap<String, String> Menu) {
		int result = 0;
		int uNum = menuList.size() + 1;
		try {
			Menu.put("uNum", uNum + "");
			menuList.add(Menu);
			result = 1;
		} catch (Exception e) {
			System.out.println("지금 코드로 내가 출력될일은 없어");
		}
		return result;
	}

	public static void inputData() {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴의 이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("메뉴의 가격을 입력해주세요");
		String price = scan.nextLine();
		System.out.println("메뉴의 인분을 입력해주세요");
		String cnt = scan.nextLine();
		hm.put("mName", name);
		hm.put("mPrice", price);
		hm.put("mCnt", cnt);
		int aa = insertMenu(hm);
		if (aa == 1) {
			System.out.println("메뉴등록이 성공하였습니다.");
		} else {
			System.out.println("뭔지는 모르지만 에러났어요~");
		}
	}

	public static void selectMenu() {
		for (int i = 0; i < menuList.size(); i++) {

			System.out.println(menuList.get(i));
		}

	}

	public static boolean start() {
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("몇개의 메뉴를 입력하시겠습니까?");
			int aa = Integer.parseInt(scan.nextLine());
			for (int i = 0; i < aa; i++) {
				inputData();
				
			}
			return true;

		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요");
			
		}
		return false;
	}
	public static int userIndexOf(String mName){
		for(int i=0;i<menuList.size();i++) {
			HashMap<String,String> menu = menuList.get(i);
			if(menu.get("mName").equals(mName)) {
				return i;
			}
		}
		return -1;
	}
	public static void removeMenu(HashMap<String,String> menu) {
		menuList.remove(menu);
	}
	
	public static void main(String[] args) {
		System.out.println("메뉴 프로그램을 시작합니다.");

		boolean aaa = false;
		while (!aaa) {
			aaa=start();

		}
	}
}
