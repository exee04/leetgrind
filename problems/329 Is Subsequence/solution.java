class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isSubsequence("ace", "abcde")); // should be true
        System.out.println(sol.isSubsequence("axc", "ahbgdc")); // should be false
    }
            public boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.length() == 0){
            return true;
        }
        for(int i = 0; i < t.length(); i++){
            if(j == s.length()){
                break;
            }
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        return s.length() == j;
    }
}