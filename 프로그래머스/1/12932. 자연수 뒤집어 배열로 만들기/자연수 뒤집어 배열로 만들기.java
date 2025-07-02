class Solution {
	public  int[] solution(long n) {
		String[] result = String.valueOf(n).split("");
		int[] answer = new int[result.length];
	
		for (int i=0; i<result.length; i++) {
			answer[result.length-1-i] = Integer.parseInt(result[i]);
		}

		return answer;
	}

}