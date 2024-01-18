package lv0;
import java.util.*;

public class _2의_영역 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181894

	class Solution {
	    public int[] solution(int[] arr) {
	        List<Integer> idx = new ArrayList<>();
	        
	        for(int i=0; i<arr.length; i++)
	            if(arr[i]==2) idx.add(i);
	        
	        if(idx.size()==0) return new int[] {-1};
	        
	        int startIdx = idx.get(0);
	        int endIdx = idx.get(idx.size()-1);
	        
	        return Arrays.copyOfRange(arr, startIdx, endIdx+1);
	    }
	}
}
