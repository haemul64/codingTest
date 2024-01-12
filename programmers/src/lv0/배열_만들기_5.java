package lv0;
import java.util.*;

public class 배열_만들기_5 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181912
	
	class Solution {
	    public int[] solution(String[] intStrs, int k, int s, int l) {
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i=0; i<intStrs.length; i++) {
	            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
	            if(num > k) list.add(num);
	        }
	        
	        int[] answer = new int[list.size()];
	        
	        for(int i=0; i<list.size(); i++) {
	            answer[i] = list.get(i);
	        }
	        
	        return answer;
	    }
	}
}
