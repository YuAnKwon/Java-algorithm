class Solution {
     public long solution(int price, int money, int count) {
    	long sum = (long)count * (price + price*count) / 2;
    	return Math.max(0, sum - money);
    }
}