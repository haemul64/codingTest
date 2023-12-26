package lv0;
import java.util.*;

public class 접미사_배열 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181909

	class Solution {
	    public String[] solution(String my_string) {
	        String[] answer = new String[my_string.length()];
	        
	        for(int i=0; i<my_string.length(); i++) {
	            answer[i] = my_string.substring(i);
	        }
	        
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	}
}
