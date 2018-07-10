package test08;

public class LottoTest {

	public static void main(String[] args) {
		int[] a= new int[6];
		for(int i=0;i<6;i++) {
			int d = (int)(Math.random()*45)+1;
			a[i]= d;
			System.out.println(a[i]);
			
		}
	}
}
