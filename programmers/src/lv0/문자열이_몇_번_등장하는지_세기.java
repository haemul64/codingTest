package lv0;

public class 문자열이_몇_번_등장하는지_세기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181871
	// +2
	
	class Solution {
	    public int solution(String myString, String pat) {
	        int answer = 0;
	        
	        for(int i=0; i<myString.length()-pat.length()+1; i++)
	            if(myString.substring(i, i + pat.length()).contains(pat)) answer++;
	        
	        return answer;
	    }
	}
}