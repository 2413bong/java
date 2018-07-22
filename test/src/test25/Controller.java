package test25;

import java.util.Scanner;

public class Controller {
	public void callOrder(String order) {
		Service sv = new Service();
		if("1".equals(order)) {
			System.out.println("유저리스트를 보여드립니다");
			sv.select();
		}else if("2".equals(order)) {
			System.out.println("유저정보 추가를 시작합니다");
			sv.insert();
		}else if("3".equals(order)) {
			System.out.println("유저정보 수정을 시작합니다");
		}else if("4".equals(order)) {
			System.out.println("유저정보 삭제를 시작합니다");
			sv.delete();
		}else if("q".equals(order)) {
			System.out.println("종료 되었습니다");
			System.exit(0);
		}else {
			System.out.println("존재하지 않는 명령어입니다");
			
	}
			
	}
}

