package test09;

public class Person {
	private String name;
	private int age;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "�� �̸��� : " + this.name + "���̴� : " + this.age + "�ּҴ�: " + this.address;
	}
	public String getName() {
		return this.name;
	}
}