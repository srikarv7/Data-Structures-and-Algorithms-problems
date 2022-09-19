class Solution {
    public int pivotIndex(int[] nums) {
        /*
         * // create the prefix sum array
         * int[] prefix = new int[nums.length];
         * prefix[0] = 0;
         * for (int i = 1; i < nums.length; i++) {
         * prefix[i] = nums[i-1] + prefix[i - 1];
         * }
         * System.out.println("prefix array:");
         * for (int i = 0; i < prefix.length; i++) {
         * System.out.print(prefix[i] + ",");
         * }
         * System.out.println();
         * 
         * int[] postfix = new int[nums.length];
         * postfix[nums.length - 1] = 0;
         * for (int i = nums.length - 2; i > -1; i--) {
         * postfix[i] = nums[i+1] + postfix[i + 1];
         * System.out.print("i = " + i + ", nums[i] = " + nums[i] + ", postfix[i+1] = "
         * + postfix[i + 1]);
         * System.out.println();
         * }
         * 
         * System.out.println("postfix array:");
         * for (int i = 0; i < postfix.length; i++) {
         * System.out.print(postfix[i] + ",");
         * }
         * 
         * int solution = -1;
         * for (int i = 0; i < nums.length; i++) {
         * if (prefix[i] == postfix[i]) {
         * solution = i;
         * break;
         * }
         * 
         * }
         * return solution;
         * 
         */

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int prefix_sum = 0;
        int solution = -1;
        // check if the pivot index is the first
        for (int i = 1; i < nums.length; i++) {
            prefix_sum = prefix_sum + nums[i - 1];
            if (prefix_sum == sum - prefix_sum - nums[i]) {
                solution = i;
                break;
            }
        }
        return solution;
    }
}
