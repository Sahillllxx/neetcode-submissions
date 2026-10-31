class Solution {
    public int trap(int[] arr) {
        
        int i = 0;
        int j = arr.length - 1;

        int leftMax = arr[0];
        int rightMax = arr[j];
        int res = 0;

        while(i < j){
            if(leftMax < rightMax){
                i++;
                leftMax = Math.max(leftMax,arr[i]);
                res += leftMax - arr[i];
            } else {
                j--;
                rightMax = Math.max(rightMax,arr[j]);
                res += rightMax - arr[j];
            }
        }

        return res;

    }
}
