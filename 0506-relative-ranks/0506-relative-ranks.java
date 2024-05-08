import java.util.Comparator;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int [] temp = new int [score.length]; 
        for (int i = 0; i < score.length; i++) {
            temp[i] = score[i];
        }  
        
        Arrays.sort(temp);
        int k=0;
        for(int i=temp.length-1;i>=0;i--) {


            hash.put(temp[k],(i+1));
           
            k++;
        }
        String [] result = new String [score.length];

        for(int i=0;i<score.length;i++){
            int h=score[i];

             
            int pos =hash.get(h);
System.out.println(h);
        
            if(pos==1){
                result[i]="Gold Medal";

            }else if (pos==2){
                result[i]="Silver Medal";
            }else if (pos==3){
                result[i]="Bronze Medal";
            }else {
                result[i]=""+pos;
            }
        }return result;
    }
}