import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		Deque<Integer> deq = new LinkedList<>();
		for (int num : arr) {
			if (deq.isEmpty() || deq.peekLast() != num  ) {
				deq.offerLast(num);
			} else {
				continue;
			}
		}

		int[] answer = new int[deq.size()];
		int i = 0;
		for (int num : deq) {
			answer[i] = num;
			i++;
		}
		return answer;
	}
}