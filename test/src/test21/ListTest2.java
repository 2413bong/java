package test21;

import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			int o =(int)(Math.random()*45+1);
			al.add(o);
		}
		for(int y:al) {
			System.out.println(y);

			}
		}
		
	}


