class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)return 1;
        int people[][]=new int[n+1][2];
        for(int i =0;i<trust.length;i++){
            int temp=trust[i][0];
            people[temp][0]+=1;
            
            people[trust[i][1]][1]+=1;
        }
        
        for(int i =0;i<people.length;i++){
           
               
               if(people[i][1]==(n-1) && people[i][0] ==0){
                   return i;
               }
           
        }return -1;
        
    }
}