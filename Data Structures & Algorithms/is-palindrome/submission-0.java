class Solution {
    public boolean isPalindrome(String s) {
        String original = "";
        String rev = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                original += Character.toLowerCase(s.charAt(i));
            }
        }
        for(int j = original.length()-1; j>=0; j--){
            rev += original.charAt(j);
        }

        if(rev.equals(original)){
            return true;
        }
        return false;
    }
}
