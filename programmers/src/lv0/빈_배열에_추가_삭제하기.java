package lv0;
import java.util.*;

public class 빈_배열에_추가_삭제하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181860

	class Solution {
	    public int[] solution(int[] arr, boolean[] flag) {
	        ArrayList<Integer> li = new ArrayList<>();
	        
	        for(int i=0; i<flag.length; i++) {
	            if(flag[i]) {
	                for(int j=0; j<arr[i]*2; j++)
	                    li.add(arr[i]);
	            } else {
	                for(int j=0; j<arr[i]; j++)
	                    li.remove(li.size()-1);
	            }
	        }
	        
	        int[] ans = new int[li.size()];
	        
	        for(int i=0; i<li.size(); i++) {
	            ans[i] = li.get(i);
	        }
	        
	        return ans;
	    }
	}
}
