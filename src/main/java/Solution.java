class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int prev = nums[0];
        int[] res = new int[n];
        int target = (int) Math.pow(2, maximumBit) - 1;
        res[n - 1] = nums[0] ^ target;
        for (int i = 1; i < n; i++) {
            prev = prev ^ nums[i];
            res[n - 1 - i] = prev ^ target;

        }

        return res;
    }
}