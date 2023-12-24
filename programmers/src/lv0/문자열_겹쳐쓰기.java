package lv0;

public class 문자열_겹쳐쓰기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181943
	
	class Solution {
	    public String solution(String myStr, String overwriteStr, int s) {
	        return myStr.substring(0, s) + overwriteStr + myStr.substring(s+overwriteStr.length());
	    }
	}
}
