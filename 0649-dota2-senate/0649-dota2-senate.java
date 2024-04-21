class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 =new LinkedList<>();
        Queue<Integer> q2 =new LinkedList<>();
        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                q1.add(i);
            }else{
                q2.add(i);
            }
        }
        if (q1.isEmpty())  return "Dire";
            else if(q2.isEmpty()) return "Radiant";
        while(!q1.isEmpty() || !q2.isEmpty()){
            int r=q1.poll();
            int d=q2.poll();
            if( r<d){
                q1.add(r+senate.length());
            }else{
                q2.add(d+senate.length());
            }
             if (q1.isEmpty())  return "Dire";
            else if(q2.isEmpty()) return "Radiant";
        }
        return null;
    }
}