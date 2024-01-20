package lv0;
import java.util.Arrays;

public class 왼쪽_오른쪽 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181890
	// +7

	class Solution {
	    public String[] solution(String[] str_list) {
	        char lr = ' ';
	        int idx = 0;
	        
	        for(int i=0; i<str_list.length; i++) {
	            idx = i;
	            if(str_list[i].equals("l")) {
	                lr = 'l';
	                return Arrays.copyOfRange(str_list, 0, idx);
	            } else if(str_list[i].equals("r")) {
	                lr = 'r';
	                return Arrays.copyOfRange(str_list, idx+1, str_list.length);
	            }
	        }
	        
	        return new String[] {};
	    }
	}
}
