class Solution {
    public int countSubstrings(String s) {
        int left,right,len=s.length();
        int count=0;
        for(int i=0;i<len;i++ ){
            left=right=i;
            while(left >=0 && right <len && s.charAt(left)==s.charAt(right) ){
                count++;
                left--;
                right++;
            }
            left=i;
            right=i+1;
            
             while(left >=0 && right <len && s.charAt(left)==s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            
            
            
            
            
            
        }return count;
        
        
    }
}