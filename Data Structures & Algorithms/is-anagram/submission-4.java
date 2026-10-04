class Solution {
    public boolean isAnagram(String s, String t) {
        
        // if(s.length() != t.length()){
        //     return false;
        // }
        
        // int[] count = new int[26];

        // for(int i = 0; i < s.length(); i++){
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }

        // for(int i = 0; i < count.length; i++){
        //     if(count[i] != 0){
        //         return false;
        //     }
        // }

        // return true;
        
        if(s.length() != t.length()){
            return false;
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
