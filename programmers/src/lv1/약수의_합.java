package lv1;

public class 약수의_합 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12928
	
	class Solution {
	    public int solution(int n) {
	        int sum = n;
	        
	        for(int i=1; i<=n/2; i++) 
	            if(n%i==0) sum += i;
	        
	        return sum;
	    }
	}
}
