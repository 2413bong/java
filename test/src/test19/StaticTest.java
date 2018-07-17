package test19;

public class StaticTest {
	
	static int a = 10;
	
	public static void main(String[] args) {
		StaticTest.a = 11;
		System.out.println(a);
		StaticTest st = new StaticTest();
		System.out.println(st.a);
		
	}

}
