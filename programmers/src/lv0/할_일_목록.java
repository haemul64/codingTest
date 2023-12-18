package lv0;
import java.util.*;

public class 할_일_목록 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181885

	class Solution {
	    public String[] solution(String[] todo_list, boolean[] finished) {
	        List<String> li = new ArrayList<>();
	        
	        for(int i=0; i<finished.length; i++)
	            if(!finished[i]) li.add(todo_list[i]);
	        
	        return li.toArray(new String[li.size()]);
	    }
	}
}
