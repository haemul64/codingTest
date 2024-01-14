package lv0;

public class 주사위_게임_3 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181916
	// +3
	
	class Solution {
	    public int solution(int a, int b, int c, int d) {
	        int p=0, q=0, r=0;
	        
	        // 1. 배열 count의 인덱스 a, b, c, d에 1씩 더한다
	        int[] count = {0, 0, 0, 0, 0, 0, 0};
	        count[a]++;
	        count[b]++;
	        count[c]++;
	        count[d]++;
	        
	        // 2. count의 원소들을 하나씩 문자열 numbers에 이어붙이기 (인덱스: 0~6)
	        String numbers = "";
	        for(int i=0; i<count.length; i++)
	            numbers += count[i];
	        
	        // 3. 조건 확인 후 결과값 리턴
	        if(numbers.contains("4")) return 1111 * a;
	        if(numbers.contains("3")) {
	            p = numbers.indexOf("3");
	            q = numbers.indexOf("1");
	            return (10 * p + q) * (10 * p + q);
	        }
	        if(numbers.contains("2")) {
	            String newNum = numbers.replaceAll("2", "0");
	            if(!newNum.contains("1")) {
	                p = numbers.indexOf("2");
	                q = numbers.replaceFirst("2", "0").indexOf("2");
	                return (p+q) * Math.abs(p-q);
	            }
	            q = numbers.indexOf("1");
	            r = numbers.replaceFirst("1", "0").indexOf("1");
	            return q * r;
	        }
	        
	        int[] arr = {a, b, c, d};
	        int min = 7;
	        
	        for(int i=0; i<arr.length; i++)
	            if(arr[i] < min) min = arr[i];
	        
	        return min;
	    }
	}
}