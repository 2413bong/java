package test14;

public class Person {
	String name;
	int age;
	
	public  Person(String name , int age) {
		this.name= name;
		this.age = age;
	}
	public String toString() {
		return ("이사람의 이름은 "+name+"이며 나이는 "+age+" 이다");
	}

}
