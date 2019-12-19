package Leetcode;
public class MaximumSubarray {
    // use greedy to solve this problem
    public static int MaxSubarrayGreedy(int[] nums) {
        // define length of nums
        int l = nums.length;
        // greedy is consider each local maximum is one part of global maximum
        // use currMax to save curr Max array or single element
        int currMax = nums[0];
        // use sumMax to save local maximum value
        int sumMax = nums[0];
        //
        for (int i=1;i<l;i++) {
            // currMax
            currMax = Math.max(nums[i],currMax+nums[i]); // check new value bigger or contiguos is bigger
            // check maxSum
            sumMax = Math.max(currMax,sumMax); // check new local option is bigger or previous option is bigger

        }
        return sumMax;
    }



    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubarrayGreedy(array));

    }
}
