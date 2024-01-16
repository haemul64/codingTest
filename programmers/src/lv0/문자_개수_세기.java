package lv0;

public class 문자_개수_세기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181902
	
	class Solution {
	    public int[] solution(String my_string) {
	        int[] answer = new int[52];
	        
	        for(int i=0; i<my_string.length(); i++) {
	            char target = my_string.charAt(i);
	            if(Character.isUpperCase(target)) {
	                int idx = target - 'A';
	                answer[idx]++;
	            } else {
	                int idx = target - 'a' + 26;
	                answer[idx]++;
	            }
	        }
	        
	        return answer;
	    }
	}
}
