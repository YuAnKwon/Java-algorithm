class Solution {
    public  int solution(int n) {
        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int tmp = first;
            first = second;
            second = (tmp + second)% 1234567;
        }
        return second ;
    }
}
