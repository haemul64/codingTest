package lv0;

public class 꼬리_문자열 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181841

	class Solution {
	    public String solution(String[] str_list, String ex) {
	        String ans = "";
	        
	        for(String str : str_list) {
	            if(str.contains(ex)) continue;
	            ans += str;
	        }
	        
	        return ans;
	    }
	}
}
