package lv0;
import java.util.*;

public class 문자열_정렬하기_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120850

	class Solution {
	    public int[] solution(String my_string) {
	        
	        List<Integer> li = new ArrayList<>();
	        
	        for(char ch : my_string.toCharArray()) {
	            if('0' <= ch && ch <= '9')
	                li.add(ch-'0');
	        }
	        
	        int[] ans = new int[li.size()];
	        
	        for(int i=0; i<li.size(); i++) {
	            ans[i] = li.get(i);
	        }
	        
	        Arrays.sort(ans);
	        
	        return ans;
	    }
	}
}

//str.replaceAll("[A-Z|a-z]", "");