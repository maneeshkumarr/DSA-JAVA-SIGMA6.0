package ChallengePart2.Strings.longestsubstring;

import java.util.HashSet;
import java.util.Set;
public class first {

  public static int longestsubstring(String s){
    int left=0;
    int maxlen=0;

    Set<Character> set=new HashSet<>();
    for(int right=0;right<s.length();right++){
      while(set.contains(s.charAt(right))){
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      maxlen=Math.max(maxlen,right-left+1);
    }
    return maxlen;
  }
  public static void main(String[] args) {
    String s="aaabaccv";

    System.out.println(longestsubstring(s));
  }
}
