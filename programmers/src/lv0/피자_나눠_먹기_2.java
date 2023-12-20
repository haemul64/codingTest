package lv0;

public class 피자_나눠_먹기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120815

	class Solution {
	    public int solution(int n) {
	        int pizza = 1;
	        
	        while(true) {
	            if(pizza*6%n==0) return pizza;
	            else pizza++;
	        }
	    }
	}
}
