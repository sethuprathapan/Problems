class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> hash = new HashMap<>();
        for(int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        int maxCount=0;
        int count=0;
        int extra=0;
        for(Map.Entry <Integer,Integer> entry : hash.entrySet()){
           count= entry.getValue();
           if(maxCount<count){
               maxCount=count;
               extra=0;
               count=0;
           }else if (maxCount==count){
               extra+=count;
               count=0;

           }
           
           
        }
        return maxCount+extra;
    }
}