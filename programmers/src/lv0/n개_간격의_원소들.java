package lv0;
import java.util.*;

public class n개_간격의_원소들 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181888

	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        List<Integer> li = new ArrayList<>();
	        
	        for(int i=0; i<num_list.length; i+=n)
	            li.add(num_list[i]);

	        int[] ans = new int[li.size()];
	        
	        for(int i=0; i<ans.length; i++)
	            ans[i] = li.get(i);
	        
	        return ans;
	    }
	}
}
