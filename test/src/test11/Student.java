package test11;

public class Student {

	private String clazz;
	private String name;
	private int grade;
	
	public void info(String a,String b,int c) {
		this.clazz = a;
		this.name = b;
		this.grade = c;
	}
	public void printInfo() {
		System.out.println("�л��� �̸��� : "+ name);
		System.out.println("�л��� ���� : "+ clazz);
		System.out.println("�л��� �г��� : "+ grade);
	}
	
	
}
