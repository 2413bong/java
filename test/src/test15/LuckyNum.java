package test15;

public class LuckyNum {
	private int luckyNum;
	
	LuckyNum(){
		luckyNum = ((int)Math.random()*10)+1;
	}
	public void checkLuckyGuy(Person p) {
//		System.out.println(p instanceof KilDong);
		if(p instanceof KilDong) {
			KilDong kd = (KilDong)p;
			kd.checkMyLuckyNum(luckyNum);
			
		}
	}

}
