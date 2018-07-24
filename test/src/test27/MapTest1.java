package test27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest1 {

	static List<HashMap<String, String>> getList(){
		List<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();
		for (int i = 1; i <= 3; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("name" + i, "테스트 데이터" + i);
			hm.put("age" + i, "운영 데이터" + i);
			al.add(hm);
		}
		return al;
		
		
	}
	public static void main(String[] args) {
		for(int i = 0;i <3;i++) {
			System.out.println(getList().get(i));
		}
		
		}

	
}
