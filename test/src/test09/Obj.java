package test09;

public class Obj {
	int num = 3;
	boolean bl = true;
	
	int getNum() {
		return 1;
	}
	
	String getStr() {
		return "abc";
	}
	
	void test(){
		int num = 10;
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("난 obj의 테스트 함수");
	}
	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}
	public static void main(String[] args) {
		Obj o= new Obj();
		o.test();
		
	}

}
