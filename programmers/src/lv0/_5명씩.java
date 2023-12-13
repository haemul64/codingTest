package lv0;

import java.util.*;

public class _5명씩 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181886
		// +7
	}

	class Solution {
	    public String[] solution(String[] names) {
	        List<String> list = new ArrayList<>();
	        
	        for(int i=0; i<names.length; i+=5) {
	            list.add(names[i]);
	        }

	        return list.toArray(new String[list.size()]);
	    }
	}
}

// 다른 풀이
// answer[i] = names[5*i];