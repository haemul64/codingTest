package lv0;
import java.util.Arrays;

public class 문자열_정렬하기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120911

	class Solution {
	    public String solution(String my_string) {
	        String str = "";
	        char[] chs = my_string.toLowerCase().toCharArray();
	        Arrays.sort(chs);
	        
	        for(int i=0; i<chs.length; i++)
	            str += chs[i];
	        
	        return str;
	    }
	}
}
