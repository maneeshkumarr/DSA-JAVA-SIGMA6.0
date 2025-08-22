package ChallengePart2.Strings.nonrepchar;

import java.util.*;

public class first {

  public static int nonrep(String s){
    Map<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }

    for(int i=0;i<s.length();i++){
      if(map.get(s.charAt(i))==1){
        return i;
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    String s="iieabe";

    System.out.println(nonrep(s));
  }
}
