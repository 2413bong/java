package test11;

public class Car {
	
	private int speed;
	private String name;
	private String company;
	
	public void setInfo(int a,String b,String c) {
		this.speed = a;
		this.name = b;
		this.company = c;
	}
	public void printInfo() {
		System.out.println("차의 이름: "+name);
		System.out.println("차의 속도: "+speed);
		System.out.println("차의 회사명: "+company);
	}

}
