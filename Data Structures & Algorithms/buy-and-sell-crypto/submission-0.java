class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        int n = prices.length;

        for(int i=1;i<n;i++){
            curr = Math.min(curr,prices[i]);
            int res = prices[i] - curr;
            max = Math.max(res,max);
        }

        return max;
    }
}
