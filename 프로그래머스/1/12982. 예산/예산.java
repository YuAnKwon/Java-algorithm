import java.util.Arrays;

class Solution {
    public  int solution(int[] d, int budget) {
		Arrays.sort(d); // 오름차순 정렬
		int cnt=0;
		int sum=0;
		
		// 1 2 3 4 5
		for(int num : d) {
			sum += num;
			if(sum <= budget) {
				cnt++;	
			} else{
                break;
            }
		}
		return cnt;
	}
}