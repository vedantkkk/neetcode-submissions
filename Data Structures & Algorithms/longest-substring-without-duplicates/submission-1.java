class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int count = 0;

        while(j<s.length()){
            if(!set.contains(s.charAt(j))){

                set.add(s.charAt(j));
                j++;
                int num = j-i;
                count = Math.max(num,count);
            }
            else{
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        } 

        return count;   

    }
}
