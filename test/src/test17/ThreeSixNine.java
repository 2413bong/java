package test17;

public class ThreeSixNine {
	public static void main(String[] args) {
		int ranNum= 100 ;
		int cnt = 0 ;
		for(int i = 1 ;i<ranNum;i++) {
			String s =i+"";
			if (s.indexOf("3")!=-1||s.indexOf("6")!=-1||s.indexOf("9")!=-1) {
				System.out.println(s);
				cnt++;
				
			}
			
			
		}
		System.out.println("짝 갯수 "+cnt);
		}
	}


//배열로 나눠서 쪼개고 캐릭터로 들인 다움에 캐릭터 하나하나 비교 비교하고 맞다면 바로 브레이크

