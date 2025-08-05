import java.util.TreeSet;
class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                treeSet.add(tmp+numbers[j]);
            }
        }
        return treeSet;
    }
}