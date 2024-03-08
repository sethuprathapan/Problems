class Solution {
    public int equalPairs(int[][] grid) {
        HashMap <String,Integer>map =new HashMap <>();
        StringBuilder sb=new StringBuilder();
        
        
        int count=0;
        
        for(int []row:grid){
            String val="";
            for(int  elem:row){
               val+="_"+elem;

            }
            
            if(map.containsKey(val)){
               int v =map.get(val)+1;
                map.put(val,v);
               

            }else{
                map.put(val,1);

            }
            
            
            

        }

int ans=0;
        for(int i =0;i<grid.length;i++){
             String val="";
            for(int j=0;j<grid[0].length;j++){
                 
                 val+="_"+grid[j][i];

            }
             if(map.containsKey(val)){
                 ans+=map.get(val);
             
               

            }
            
           
        }

      

        return ans;
    }
}