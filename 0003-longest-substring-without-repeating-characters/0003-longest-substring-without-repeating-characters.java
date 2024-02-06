class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash=new HashSet<>();
        // for(int i = 0; i < s.length;i++){
            
        // }
        int i=0,j=0;
        int len=0;
        while(i<s.length()){
            if(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(j));
                j++;
            }
            else{
                hash.add(s.charAt(i));
                len=Math.max(len,hash.size());
                i++;

            }

        }
        return(len);
    }
}