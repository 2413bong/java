package test21;

import java.util.ArrayList;

public class LIstTEst {
	
	public static void main(String[] args) {
		String str = "12345";
		int idx = str.indexOf("345");
		System.out.println(idx);
		
		ArrayList<String> arrStr = new ArrayList<String>();
		System.out.println(arrStr.size());
		arrStr.add("박경훈");
		arrStr.add("전승현");
		arrStr.add("김기섭");
		arrStr.remove("김기섭");
		System.out.println(arrStr.size());
		
		int idx1 = arrStr.indexOf("김기섭");
		System.out.println(idx1);
		for(String asd:arrStr) {
			System.out.println(asd);
			
		}
	}

}
