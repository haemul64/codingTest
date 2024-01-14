package lv0;
import java.util.*;

public class 세_개의_구분자 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181862

	class Solution {
	    public String[] solution(String myStr) {
	        String[] strArr = myStr.split("[a-c]");
	        List<String> li = new ArrayList<>();
	        
	        for(int i=0; i<strArr.length; i++) {
	            if(!strArr[i].isBlank()) li.add(strArr[i]);
	        }
	        
	        if(li.size()==0) return new String[]{"EMPTY"};
	        
	        return li.toArray(new String[li.size()]);
	    }
	}
}
