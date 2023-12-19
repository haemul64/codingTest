package lv0;
import java.util.*;

public class ad_제거하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181870

	class Solution {
	    public String[] solution(String[] strArr) {
	        List<String> li = new ArrayList<>();
	        
	        for(int i=0; i<strArr.length; i++) {
	            if(!strArr[i].contains("ad")) li.add(strArr[i]);
	        }
	        
	        return li.toArray(new String[li.size()]);
	    }
	}
}