package lv0;

public class 인덱스_바꾸기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120895

	class Solution {
	    public String solution(String my_string, int num1, int num2) {
	        String ans = "";
	        char[] ch = my_string.toCharArray();
	        
	        char tmp = ch[num1];
	        ch[num1] = ch[num2];
	        ch[num2] = tmp;
	        
	        for(int i=0; i<ch.length; i++)
	            ans += ch[i];
	        
	        return ans;
	    }
	}
}
