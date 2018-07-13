package test14;

public class Exec1 {

	public static void main(String[] args) {
		Object c = new PC();
		((PC) c).display = "33인치";
		System.out.println(c);
		c.toString();
	}
}
