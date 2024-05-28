class Solution {
    public int specialArray(int[] nums) {
        int[] freq = new int[1001];
        int n = nums.length;
        for (int x : nums) {
            freq[x]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (n == i) {
                return i;
            }
            n -= freq[i];
        }
        return -1;
    }
}
