class Solution {
    public String removeStars(String s) {
        int count=0;
        String newString="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*'){
                count++;
            }
            if(s.charAt(i)!='*'&& count==0){
                newString=s.charAt(i)+newString;
                
            }else{
                if(s.charAt(i)!='*'&& count>0){
                    count--;
                }
                
            }
        }return newString;
       
    }
}