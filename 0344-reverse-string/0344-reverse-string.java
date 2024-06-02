class Solution {
    public void reverseString(char[] s) {
        
        int back= s.length-1;
        int front=0;
        char temp;

        while(front<back){
           temp= s[front];
           s[front++]= s[back];
           s[back--]=temp;
           


        }
    }
}