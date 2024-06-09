class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int min[] = new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(String word : words){
            int ary[]= new int[26];
            for(char c :word.toCharArray()){
                ary[c-'a']++;

            }
            for(int i=0;i<26;i++){
                min[i]=Math.min(min[i],ary[i]);
            }

        }
        for(int k=0;k<26;k++){
            while(min[k]>0){
                list.add("" + (char)(k+'a'));
                min[k]--;
            }
        }
return list;
        
    }
}