class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
              while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }
                deque.addLast(i);
                   if (i >= k - 1) {
                ans[i - k + 1] = nums[deque.peekFirst()];
            }
        }
  return ans;
    }
}