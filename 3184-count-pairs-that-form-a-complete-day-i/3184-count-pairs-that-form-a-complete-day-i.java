class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count=0;
        for(int val1=0;val1<hours.length-1;val1++){
            //System.out.println("val1="+val1);
           for(int val2=val1+1;val2<hours.length;val2++){
               int sum=hours[val1]+hours[val2];
               
              System.out.println(hours[val2]+"val2");
              // System.out.println(sum);
               if(sum%24==0){
                   count++;
               }
            
        } 
        }return count;
        
    }
}