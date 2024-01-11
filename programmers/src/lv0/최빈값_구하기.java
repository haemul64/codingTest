package lv0;
import java.util.*;

public class 최빈값_구하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120812
	// +2
	
	class Solution {
	    public int solution(int[] array) {
	        Arrays.sort(array);
	        int maxValue = array[array.length-1];
	        int[] count = new int[maxValue+1];
	        
	        for(int num : array)
	            count[num]++;
	        
	        int maxCount = 0;
	        int mode = 0;
	        for(int i=0; i<count.length; i++) {
	            if(count[i]>maxCount) {
	                maxCount = count[i];
	                mode = i;
	            } else if(count[i]==maxCount) mode = -1;
	        }
	        
	        return mode;
	    }
	}
}
