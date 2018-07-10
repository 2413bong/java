package test09;

public class InitTest {
	int n = 10;
	String str = "abc";
	InitTest(){
		
	}

	public static void main(String[] args) {
		InitTest it = new InitTest();
		it.n = 20;
		it = new InitTest();
	}
}
