class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0;

        for (int num : nums1) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        // If there is at least one odd number,
        // we can make all elements odd.
        // If there are no odd numbers, all are already even.
        return true;
    }
}