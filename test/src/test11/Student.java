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
		System.out.println("학생의 이름은 : "+ name);
		System.out.println("학생의 반은 : "+ clazz);
		System.out.println("학생의 학년은 : "+ grade);
	}
	
	
}
