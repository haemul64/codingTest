package lv0;

public class _9로_나눈_나머지 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181914
	
	class Solution {
	    public int solution(String number) {
	        int sum = 0;
	        
	        for(char c : number.toCharArray())
	            sum += c-'0';
	        
	        return sum%9;
	    }
	}
}
