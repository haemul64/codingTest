package lv0;
import java.util.*;

public class 배열_조각하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181893
	// +4

	class Solution {
	    public int[] solution(int[] arr, int[] query) {
	        int from=0, to=0;
	        
	        for(int i=1; i<query.length; i++) {
	            if(i%2>0)
	                from += query[i];
	            else
	                to = from + query[i];
	        }
	        
	        return Arrays.copyOfRange(arr, from, to+1);
	    }
	}
}
