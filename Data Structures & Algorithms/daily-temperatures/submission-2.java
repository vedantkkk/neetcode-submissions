class Solution {
    public int[] dailyTemperatures(int[] nums) {

        int n = nums.length;
        int[] arrr = new int[n];

        for(int i = 0; i < n; i++) {

            boolean found = false;

            for(int j = i + 1; j < n; j++) {

                if(nums[j] > nums[i]) {
                    arrr[i] = j - i;
                    found = true;
                    break;
                }
            }

            if(!found) {
                arrr[i] = 0;
            }
        }

        return arrr;
    }
}