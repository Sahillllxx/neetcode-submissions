class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int idx = 0; idx < nums.length; idx++) {

             if (idx > 0 && nums[idx] == nums[idx - 1]) {
                continue;
            }

            int i = idx + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[idx] + nums[i] + nums[j];
                if (sum == 0) {
                    list.add(List.of(nums[idx], nums[i], nums[j]));

                    i++;
                    j--;

                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }

                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return list;
    }
}
