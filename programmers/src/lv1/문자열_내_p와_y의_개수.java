package lv1;

public class 문자열_내_p와_y의_개수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12916
	// +3
	
	class Solution {
	    boolean solution(String s) {
	        int n_p = 0, n_y = 0;
	        
	        for(char ch : s.toLowerCase().toCharArray()) {
	            if(ch=='p') n_p++;
	            else if(ch=='y') n_y++;
	        }
	        
	        return n_p==n_y ? true : false;
	    }
	}
}

// count 변수 하나로 확인하는 것도 가능! (count == 0 일때 p의 개수와 y의 개수가 같게)