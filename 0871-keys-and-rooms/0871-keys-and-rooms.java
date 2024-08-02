class Solution {
    boolean visited[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        visited= new boolean[rooms.size()];
        visited[0]=true;
        dfs(rooms,0);
        for(boolean b:visited){
            if(b==false){
                return false;
            }
        } return true;

    }
    public void dfs(List<List<Integer>> rooms,int ind){
        for(int key : rooms.get(ind)){
            if(!visited[key]){
                visited[key]=true;
                dfs(rooms,key);
            }
            
        }

    }
}