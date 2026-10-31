class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;

        int maxArea = Integer.MIN_VALUE;

        while (i < j) {
            int area = Math.abs(j - i) * Math.min(heights[i], heights[j]);
            maxArea = Math.max(maxArea, area);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
