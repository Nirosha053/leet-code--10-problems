import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLen=s.length();
        int l=0,r=0,maxLen=0;
        HashMap<Character,Integer> h1=new HashMap<>();

        while(r<sLen){
            while(l<r&&h1.containsKey(s.charAt(r))==true){
                h1.remove(s.charAt(l));
                l++;
            }
        maxLen=Math.max(maxLen,r-l+1);
             h1.put(s.charAt(r),1);
           r++;
        } 
    
     return maxLen;   
    }
}