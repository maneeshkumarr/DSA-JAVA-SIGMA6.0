package Challenge;

import java.util.*;

public class Longest {
public static int longestSubstringWithoutRepChar(String str){
  int left=0;
  int maxlen=0;
  Set<Character> set=new HashSet<>();
  for(int right=0;right<str.length();right++){
    while(set.contains(str.charAt(right))){
      set.remove(str.charAt(left));
      left++;
    }
    maxlen=Math.max(maxlen,right-left+1);
    set.add(str.charAt(right));
  }
  return maxlen;
}
  public static void main(String[] args) {
   String str="leetcode";
   System.out.println(longestSubstringWithoutRepChar(str)); 
  }
}
