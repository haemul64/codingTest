package lv0;
import java.util.*;

public class 접미사인지_확인하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181908

	class Solution {
	    public int solution(String my_string, String is_suffix) {
	        List<String> strli = new ArrayList<>();
	        
	        for(int i=0; i<my_string.length(); i++) 
	            strli.add(my_string.substring(i));
	        
	        return strli.contains(is_suffix) ? 1 : 0;
	    }
	}
}
