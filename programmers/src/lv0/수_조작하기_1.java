package lv0;

public class 수_조작하기_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181926
	
	class Solution {
	    public int solution(int n, String control) {
	        
	        for(int i=0; i<control.length(); i++) {
	            switch(control.charAt(i)) {
	                case 'w':
	                    n += 1;
	                    break;
	                case 's':
	                    n -= 1;
	                    break;
	                case 'd':
	                    n += 10;
	                    break;
	                case 'a':
	                    n -= 10;
	                    break;
	            }
	        }
	        
	        return n;
	    }
	}
}
