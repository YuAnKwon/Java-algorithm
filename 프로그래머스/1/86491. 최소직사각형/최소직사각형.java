class Solution {
    public int solution(int[][] sizes) {
    	// 왼쪽에 큰거
    	int[] left = new int[sizes.length]; // 둘 중 큰 값들
    	int[] right = new int[sizes.length]; // 둘 중 작은 값들
    	for(int i=0; i<sizes.length; i++) {
    			left[i] = Math.max(sizes[i][0],sizes[i][1]);
    			right[i] = Math.min(sizes[i][0],sizes[i][1]);    			
    	}
    	
    	int leftMax = 0;
    	int rightMax = 0;
    	for(int i=0; i<left.length; i++) {
    		leftMax = Math.max(leftMax, left[i]);
    		rightMax = Math.max(rightMax, right[i]);
    	}
    	 	
        System.out.println(leftMax*rightMax);
        return leftMax*rightMax;
    }
}