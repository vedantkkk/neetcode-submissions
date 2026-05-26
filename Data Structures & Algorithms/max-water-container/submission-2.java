class Solution {
    public int maxArea(int[] heights) {
        int area = 1;
        int max = 0;
        int n = heights.length;
        int i = 0;
        int j = n-1;
        
        while(i<j){
            area =(Math.min(heights[i],heights[j]) * (j-i)) ;
            max = Math.max(area,max);

            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;
    }
}
