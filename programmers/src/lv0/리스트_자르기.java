package lv0;
import java.util.*;

public class 리스트_자르기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181897
	// +3

	class Solution {
	    public int[] solution(int n, int[] slicer, int[] num_list) {
	        
	        ArrayList<Integer> ansLi = new ArrayList<>();
	        int a = slicer[0], b = slicer[1], c = slicer[2];
	        
	        if(n==1) return Arrays.copyOfRange(num_list, 0, b+1);
	        else if(n==2) return Arrays.copyOfRange(num_list, a, num_list.length);
	        else if(n==3) return Arrays.copyOfRange(num_list, a, b+1);

	        for(int i=a; i<b+1; i+=c) 
	            ansLi.add(num_list[i]);
	        return ansLi.stream().mapToInt(i->i).toArray();
	    }
	}
}
