class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Store unique elements
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(map.keySet());

        // Sort by frequency
        arr.sort((a,b) -> map.get(b) - map.get(a));

        // Store answer
        int[] rum = new int[k];

        for(int i = 0; i < k; i++){
            rum[i] = arr.get(i);
        }

        return rum;
    }
}