package test01;

public class Condition {

	public static void main(String[] args) {
		boolean bl = 1!=1;
		
		if (bl) {
			System.out.println("1�� 1�� �翬�� ���� ��û��!");
		}else {
			System.out.println("1�� 1�� �ٸ��� ���̵�??");
			}
		
		int age = 23;
		if (age>=40) {
			System.out.println("40�뱺��");
		}else if (age>=30) {
			System.out.println("30�뱺��");
		}else if (age>=20) {
			System.out.println("20�뱺��");
		}else if (age>=20) {
			System.out.println("10�뱺��");
		}else {
			System.out.println("���!");
			//�߸��Ȱ� ã�ƺ���
		}
	}
}

	

