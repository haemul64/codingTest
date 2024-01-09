package lv0;
import java.util.*;

public class 배열_만들기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181921

	class Solution {
	    public int[] solution(int l, int r) {
	        List<Integer> li = new ArrayList<>();
	        int[] absense = {-1};
	        
	        for(int i=l; i<=r; i++) {
	            if(i%5!=0) continue;
	            if(String.valueOf(i).matches("[05]+")) li.add(i);
	        }
	        
	        if(li.size()==0) return absense;
	        return li.stream().mapToInt(Integer::intValue).toArray();
	    }
	}
}