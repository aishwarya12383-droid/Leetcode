import java.util.*;

class Solution {
    public long[] distance(int[] nums) {

        int n = nums.length;
        long[] ans = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Store indices for each value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> list : map.values()) {

            long total = 0;

            for (int index : list) {
                total += index;
            }

            long leftSum = 0;

            for (int i = 0; i < list.size(); i++) {

                long index = list.get(i);

                long left =
                    index * i - leftSum;

                long right =
                    (total - leftSum - index)
                    - index * (list.size() - i - 1);

                ans[(int) index] = left + right;

                leftSum += index;
            }
        }

        return ans;
    }
}
