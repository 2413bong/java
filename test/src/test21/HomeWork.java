//
//1. 반복문으로 1부터 10까지 찍는 소스를 작성하세요
//  (클래스 main함수까티 써야 합니다.)
//
//2. 반복문으로 10부터 1까지 짝수만 찍는 코드를 작성하세요.
//
//3. 반복문으로 10부터 1까지 홀수만 찍는 코드를 작성하세요.
//
//


package test21;

public class HomeWork {
	
	public static void main(String[] args) {
		System.out.println("1번 지문");
		for(int i =1;i<=10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("2번 지문");
		for(int i =10;i>=1;i--) {
			if(i%2==0) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("3번 지문");
		for(int i =10;i>=1;i--) {
			if(i%3==0||i==1) {
				System.out.print(i);
			}
		}
			
	}
}
	
