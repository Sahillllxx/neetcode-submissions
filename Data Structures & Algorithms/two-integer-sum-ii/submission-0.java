class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] res = new int[2];

        if (nums.length == 0)
            return new int[] {-1, -1};

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;

            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
