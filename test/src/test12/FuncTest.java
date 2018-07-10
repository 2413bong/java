package test12;

public class FuncTest {

	public void printLoop(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}

	}
	public void printLoopMinus(int start, int end) {
		for (int i = start; i >= end; i--) {
			System.out.println(i);
		}

	}


	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
//		ft.printLoop(1, 15);
		ft.printLoopMinus(10,2);

	}
}
