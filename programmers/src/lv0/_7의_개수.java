package lv0;
import java.util.*;

public class _7의_개수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120912

	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        String arr = Arrays.toString(array);
	        
	        for(char ch : arr.toCharArray())
	            if(ch=='7') answer++;
	        
	        return answer;
	    }
	}
}