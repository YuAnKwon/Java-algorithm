class Solution {
    public int[] solution(int brown, int yellow) {

        int sum = brown + yellow;
        int width = 0;
        int height = 0;
        for (int i = (int) Math.sqrt(sum); i <= sum; i++) {
            if (sum % i == 0) {
                width = Math.max(i, sum / i);
                height = Math.min(i, sum / i);
                if ((width - 2)*(height - 2) == yellow) {
                    break;
                }

            }
        }
        int[] answer = {width, height};
        System.out.printf("%d %d", width, height);
        return answer;
    }
}