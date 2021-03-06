package test26;

import java.util.ArrayList;

public class ListTest {
	private String[] strArr;

	public ListTest() {
		this.strArr = new String[0];
	}

	public boolean remove(int str) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length - 1];
		for (int i= 0; i<str; i++) {
			strArr[i]= tmpArr[i];
		}for (int i = str+1; i < tmpArr.length; i++) {
			strArr[i - 1] = tmpArr[i];

		}
		return true;
	}
	public boolean remove(String str) {
		int idx = indexOf(str);
		if(idx==-1) {
			return false;
		}
		return remove(idx);
	}
	
		


	public boolean add(String str) {
		String[] tmpArr = this.strArr;
		this.strArr = new String[this.strArr.length + 1];
		for (int i = 0; i < tmpArr.length; i++) {
			this.strArr[i] = tmpArr[i];
		}
		this.strArr[this.strArr.length - 1] = str;
		return true;
	}

	public int size() {
		return this.strArr.length;
	}

	public String toString() {
		String str = "[";
		for (String s : this.strArr) {
			str += s + ",";
		}
		str = str.substring(0, str.length() - 1);
		// 범위 만큼 잘라버린다 -1 했으니까 마지막 것만 잘리는데 ,이 잘리게된다
		str += "]";
		return str;
	}

	public String get(int idx) {
		if (this.strArr.length <= idx) {
			System.out.println(idx + "번 방같은건 없어요");
		}
		return this.strArr[idx];
	}

	public int indexOf(String str) {
		for (int i = 0; i < this.strArr.length; i++) {
			if (str.equals(this.strArr[i])) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("abc");
		lt.add("tt");
		lt.add("cc");
		lt.get(3);

		System.out.println(lt.indexOf("cc"));
	}
}
