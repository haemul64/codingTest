package lv0;

public class 더_크게_합치기 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181939

	class Solution {
	    public int solution(int a, int b) {
	        String strab = "" + a + b;
	        String strba = "" + b + a;
	        
	        int ab = Integer.parseInt(strab);
	        int ba = Integer.parseInt(strba);
	        
	        return ab>=ba ? ab : ba;
	    }
	}
}
