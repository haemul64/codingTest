package lv0;
import java.util.*;

public class 문자열_잘라서_정렬하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181866
	// +9

	class Solution {
	    public String[] solution(String myString) {
	        String[] tmp = myString.split("x");
	        
	        List<String> li = new ArrayList<>();
	        
	        for(int i=0; i<tmp.length; i++) {
	            if(tmp[i].isBlank()) continue;
	            else li.add(tmp[i]);
	        }
	        
	        String[] ans = new String[li.size()];
	        for(int i=0; i<ans.length; i++) { 
	            ans[i] = li.get(i);
	        }
	        
	        Arrays.sort(ans);
	        return ans;
	    }
	}
}
