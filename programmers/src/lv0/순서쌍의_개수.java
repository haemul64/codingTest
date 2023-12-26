package lv0;

public class 순서쌍의_개수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120836
	// +2
	
	class Solution {
	    public int solution(int n) {
	        int count = 0;
	        float multi = 0.0f;
	        
	        for(int i=1; i*i<=n; i++) {
	            if(n%i==0) count+=2;
	            if(i*i==n) count--;
	        }
	        
	        return count;
	    }
	}
}
