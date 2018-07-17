package test22;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("이름", "박경훈");
		hm.put("주소","서울 강서구 등촌1동");
		hm.put("애완동물이름", "동동이");
		String name= hm.get("이름");
		System.out.println(name);
	}
}
