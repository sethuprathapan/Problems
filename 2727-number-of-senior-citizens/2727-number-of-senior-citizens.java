class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String s : details) {
            // Extracting the substring for the age
            int num = Integer.parseInt(s.substring(11, 13));
            // Checking if the number is greater than 60
            if (num > 60) {
                count++;
            }
        }
        return count;
    }
}
