class Solution {
    public String decodeString(String s) {
        Stack <String> stackS= new Stack<>();
        Stack <Integer> stackN= new Stack<>();
        int i =0;
        String result="";
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                
                int val=0;
                while(Character.isDigit(s.charAt(i))){
                    val=10*val+s.charAt(i)-'0';
                    i++;
                    
                    
                }stackN.push(val);

            }else if(s.charAt(i)==']') {
                String st= stackS.pop();
                int n= stackN.pop();
                StringBuilder sb=new StringBuilder();
                for(int j=0; j<n;j++){
                    sb.append(result);

                }i++;
                result=st+sb.toString();

            }else if(s.charAt(i)=='[') {
                stackS.push(result);
                i++;
                result="";

            }
            else{
                
                result=result+s.charAt(i);
                i++;
               
                
            }
            
        }
        return result;
    }
}