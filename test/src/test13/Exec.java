package test13;

public class Exec {
	public static void main(String[] args) {
		Cons c = new Cons();
		System.out.println(c.num);
		c = new Cons(10);
		System.out.println(c.num);
		
		Car ca= new Car("소나타",150);

	}
}
