class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> map = new HashSet<>();
       int max = 0;

        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
                 int count = 0;
            if(!map.contains(nums[i]-1)){
                int v = nums[i];
                while(map.contains(v)){
                    count++;
                    v++;
                }
            }
            max = Math.max(max,count);
        }

        return max;
    }
}
