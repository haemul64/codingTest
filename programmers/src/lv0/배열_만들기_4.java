package lv0;
import java.util.*;

public class 배열_만들기_4 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181918
	// +2
	
	class Solution {
	    public int[] solution(int[] arr) {
	        
	        ArrayList<Integer> li = new ArrayList<>();
	        int i=0;
	        
	        while(i<arr.length) {
	            if(li.isEmpty()) {li.add(arr[i]); i++; continue;}
	            
	            int lastElement = li.get(li.size()-1);
	            if(lastElement<arr[i]) {li.add(arr[i]); i++; continue;}
	            li.remove(li.size()-1);
	        }
	        
	        int[] stk = new int[li.size()];
	        
	        for(i=0; i<stk.length; i++) {
	            stk[i] = li.get(i);
	        }
	        
	        return stk;
	    }
	}
}
