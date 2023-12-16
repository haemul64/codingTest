package lv0;
import java.util.*;

public class 마지막_두_원소 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181927

	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = Arrays.copyOf(num_list, num_list.length+1);
	        int lastEle = num_list[num_list.length-1];
	        int prevEle = num_list[num_list.length-2];
	        
	        if(lastEle>prevEle)
	            answer[answer.length-1] = lastEle - prevEle;
	        else
	            answer[answer.length-1] = lastEle*2;
	        
	        return answer;
	    }
	}
}

