class Solution {
     class FenwickTree {
        int[] tree;

        FenwickTree(int size) {
            tree = new int[size + 1];
        }

        void update(int index, int value) {
            while (index < tree.length) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }
            return sum;
        }
    }
    public long countMajoritySubarrays(int[] nums, int target) {
        
     int n = nums.length;
        int offset = n + 2;

        FenwickTree bit = new FenwickTree(2 * n + 5);

        long answer = 0;
        int prefix = 0;

        bit.update(offset, 1);

        for (int num : nums) {

            if (num == target)
                prefix++;
            else
                prefix--;

            int index = prefix + offset;

            answer += bit.query(index - 1);

            bit.update(index, 1);
        }

        return answer;
    }
}