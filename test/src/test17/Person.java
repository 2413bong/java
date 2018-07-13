package test17;

public class Person extends Human {
	Person(){
		super("김봉건",17,1);
	}
	public void printHuman() {
		 super.printHuman();
		 System.out.println("난 모르겠다");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.printHuman();
	}

}
