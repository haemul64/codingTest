package lv2;
import java.util.*;

public class 최댓값과_최솟값 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12939

	class Solution {
	    public String solution(String s) {
	        
	        String[] strs = s.split(" ");
	        int[] nums = new int[strs.length];
	        
	        for(int i=0; i<nums.length; i++) {
	            nums[i] = Integer.parseInt(strs[i]);
	        }
	        
	        Arrays.sort(nums);
	        
	        return nums[0] + " " + nums[nums.length-1];
	    }
	}
}
