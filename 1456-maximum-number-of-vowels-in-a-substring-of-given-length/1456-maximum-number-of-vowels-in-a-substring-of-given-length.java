class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int subCount=0,max=0;

        for(int i =0;i<k;i++){
            if(set.contains(s.charAt(i))){
                subCount++;
            }
        }
        max=Math.max(subCount,max);

    


        int left =0;
        int right =k;
        while(right<=s.length()-1){
            
            if(set.contains(s.charAt(right))){
                subCount++;
            }
            if(set.contains(s.charAt(left))){
                subCount--;
            }
           


max=Math.max(subCount,max);

            left++;
            right++;
        }
        return max;
        
    }
}