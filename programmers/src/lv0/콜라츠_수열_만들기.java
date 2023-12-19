package lv0;
import java.util.*;

public class 콜라츠_수열_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181919

	class Solution {
	    public int[] solution(int n) {
	        List<Integer> li = new ArrayList<>();
	        
	        while(true) {
	            li.add(n);
	                
	            if(n%2==0) n /= 2;
	            else n = 3 * n + 1;
	                    
	            if(n==1) {
	                li.add(n);
	                break;
	            }
	        }
	        
	        int[] ans = new int[li.size()];
	        for(int i=0; i<ans.length; i++) {
	            ans[i] = li.get(i);
	        }
	        
	        return ans;
	    }
	}
}
