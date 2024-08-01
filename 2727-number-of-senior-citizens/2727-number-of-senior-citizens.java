class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for(String s: details){
            String age=""+(s.charAt(11))+(s.charAt(12));
            int num=Integer.parseInt(age);
            if(num>60){
                count++;
            }
            System.out.println(num);
        }return count;
    }
}