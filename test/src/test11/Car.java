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
		System.out.println("���� �̸�: "+name);
		System.out.println("���� �ӵ�: "+speed);
		System.out.println("���� ȸ���: "+company);
	}

}
