package test12;

public class PrintObject {
	String str = "poStr";
	
	public String toString() {
		return "�� Ŭ������ str�̶������� " +str+"�̶�� ���� ����������";
	}
	public static void main(String [] args) {
		String str = "abc";
		System.out.println(str);
		PrintObject printObject = new PrintObject();
		System.out.println(printObject);
		
	}

}
