package lv0;

public class 옷가게_할인_받기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120818
		// +13
	}

	class Solution {
	    public int solution(int price) {
	        int pay = price;
	        
	        if(price>=500000) pay *= 0.8;
	        else if(price>=300000) pay *= 0.9;
	        else if(price>=100000) pay *= 0.95;
	        
	        return pay;
	    }
	}
}
