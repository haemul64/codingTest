package lv0;

public class 합성수_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120846
	// +2
	
	class Solution {
	    public int solution(int n) {
	        int cnt = 0;
	        
	        for(int i=4; i<=n; i++)
	            if(aliquot(i)>2) cnt++;
	        
	        return cnt;
	    }
	    
	    private int aliquot(int n) {
	        int cnt = 0;
	        
	        for(int i=1; i<=n; i++)
	            if(n%i==0)
	                cnt++;
	        
	        return cnt;
	    }
	}
}
