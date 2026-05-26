class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if( Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return pallin(sb,0,sb.length()-1);
    }

    public boolean pallin(StringBuilder sb,int i,int j){
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
}
