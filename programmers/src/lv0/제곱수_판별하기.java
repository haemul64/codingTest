package lv0;
import java.util.*;

public class 제곱수_판별하기 {

	public static void main(String[] args) {
  		// https://school.programmers.co.kr/learn/courses/30/lessons/120909
	}

	class Solution {
	    public int solution(int n) {
	        int answer = 2;
	        
	        for(int i=1; i<=Math.sqrt(n); i++) {
	            if(i*i==n) return 1;
	        }
	        
	        return answer;
	    }
	}
}