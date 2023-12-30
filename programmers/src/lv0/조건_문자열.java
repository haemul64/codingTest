package lv0;

public class 조건_문자열 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181934
	
	class Solution {
	    public int solution(String ineq, String eq, int n, int m) {
	        int ans = 0;
	        
	        if(ineq.equals(">") && eq.equals("=")) ans = n >= m ? 1 : 0;
	        else if(ineq.equals("<") && eq.equals("=")) ans = n <= m ? 1 : 0;
	        else if(ineq.equals(">")) ans = n > m ? 1 : 0;
	        else ans = n < m ? 1 : 0;
	        
	        return ans;
	    }
	}
}
