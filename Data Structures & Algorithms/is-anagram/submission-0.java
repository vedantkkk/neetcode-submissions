

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            mp1.put(s.charAt(i),
            mp1.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {

            mp2.put(t.charAt(j),
            mp2.getOrDefault(t.charAt(j),0) + 1);
        }

        return mp1.equals(mp2);
    }
}