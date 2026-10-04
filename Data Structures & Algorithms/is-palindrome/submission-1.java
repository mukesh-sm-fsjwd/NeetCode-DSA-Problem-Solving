class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            char chLeft = s.charAt(left);
            char chRight = s.charAt(right);

            if(!Character.isLetterOrDigit(chLeft)){
                left++;
            }else if(!Character.isLetterOrDigit(chRight)){
                right--;
            }
            else{
                if(Character.toLowerCase(chLeft) != Character.toLowerCase(chRight)){
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
