package test16;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTestex {

	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.remove(0);
		
		HashMap hm = new HashMap();
		hm.put("이름","박경훈");
		hm.put("이름","전승현");//이러면 이제 박경훈이 전승현이된다 변수를 다시 지정하는것처럼 그렇기에 사이즈도 2개
		
		hm.put("주소","서울 강서구");
		System.out.println(hm.get("이름"));
	}

}

