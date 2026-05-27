class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        if(k==1){
            return nums;
        }

        for(int i=0;i<k;i++){
            max = Math.max(max,nums[i]);
        }
            arr.add(max);

        int maxi = 0;
        int i = 1;
        int j = k+1;
        while(j<=nums.length){
            int mac = nums[i];
            for(int c = i;c<j;c++){
                 mac = Math.max(mac,nums[c]);
            }
            maxi = mac;
            arr.add(maxi);
            i++;
            j++;
        }

        int[] rum = new int[arr.size()];

        for(int a=0;a<rum.length;a++){
            rum[a] = arr.get(a);
        }

        return rum;
    }
}
