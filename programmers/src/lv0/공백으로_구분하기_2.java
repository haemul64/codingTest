package lv0;
import java.util.*;

public class 공백으로_구분하기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181868

	class Solution {
	    public String[] solution(String my_string) {
	        List<String> li = new ArrayList<>();
	        
	        String[] strs = my_string.split(" ");
	        
	        for(String str : strs) {
	            if(!str.isBlank())
	                li.add(str);
	        }
	        
	        return li.toArray(new String[li.size()]);
	    }
	}
}