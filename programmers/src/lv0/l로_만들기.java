package lv0;

public class l로_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181834

	class Solution {
	    public String solution(String myString) {
	        char[] ch = myString.toCharArray();
	        
	        for(int i=0; i<ch.length; i++)
	            if(ch[i]<'l') ch[i] = 'l';
	        
	        return new String(ch);
	    }
	}
}
