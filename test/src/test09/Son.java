package test09;

public class Son extends Father{

	public void test() {
		System.out.println("�Ƶ��� �׽�Ʈ �Լ�!");
		this.run();
		super.test();
		 
	}
	public static void main(String[] args) {
		
		Father s = new Father();
		
		
		s.test();
	}
}
