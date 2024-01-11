package lv0;

public class 공_던지기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120843
	// +3
	
	class Solution {
	    public int solution(int[] numbers, int k) {
	        int idx = 0; // 공 던지는 사람의 인덱스
	        int throwPerson = 1; // 공 던지는 사람의 번호
	        
	        for(int i=0; i<k-1; i++) { // 2번째 ~ k번째 공 던지기
	            idx += 2;
	            
	            if(idx >= numbers.length)
	                idx -= numbers.length;
	            
	            throwPerson = numbers[idx];
	        }
	        
	        return throwPerson;
	    }
	}
}
