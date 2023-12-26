package lv0;

public class 숫자_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120904
	// +2

	class Solution {
	    public int solution(int num, int k) {
	        String number = String.valueOf(num);
	        String num_k = String.valueOf(k);
	        
	        return number.contains(num_k) ? number.indexOf(num_k)+1 : -1;
	    }
	}
}
