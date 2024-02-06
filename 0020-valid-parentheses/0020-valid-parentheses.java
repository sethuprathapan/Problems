class Solution {
    public boolean isValid(String s) {
        int i = 0;
        char a;
        char p;
        boolean r= true;
        Stack <Character> ch = new Stack<>();
        while(i<s.length()){

            a= s.charAt(i);
            

            
            if (a=='{' || a=='['|| a=='('){
                ch.push(a);

            }else if(a==')' || a==']'|| a=='}'){
                if(ch.isEmpty()){
                    return false;
                }
                p= ch.pop();
                if((a==')')&& (p == '(')){
                    r=true;
                }else if ((a==']')&& (p == '[')){
                    r=true;
                }else if ((a=='}')&& (p == '{')){
                    r=true;
                }
                else{
                   return (false);
                }
               

            }
        i++;}
        if(!ch.isEmpty()){
           r = false; 
        }
        return (r);
        
    }
}