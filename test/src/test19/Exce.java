package test19;

public class Exce {
	public static void eat(Action p) {
		p.eat();
	}
	public static void move(Action p) {
		p.move();
	}
	public static void main(String[] args) {
		Action act = new Animal();
		eat(act);
		eat(new Animal());
		eat(new Person());
		move(act);
		move(new Animal());
//		act.eat();
//		act.move();
//		Animal ani = (Animal) act;
//		ani.hunt();
//		act = new Person();
//		act.eat();
//		act.move();
//		Person per = (Person) act;
//		per.work();
	}


}
