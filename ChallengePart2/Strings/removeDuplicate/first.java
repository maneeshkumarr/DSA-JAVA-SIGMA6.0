package ChallengePart2.Strings.removeDuplicate;

import java.util.*;
public class first {
  public static String RemoveDup(String s){
    TreeMap<Character,Integer> map=new TreeMap<>();
    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    StringBuilder str=new StringBuilder();

    for(char s1:map.keySet()){
     str.append(s1);
    }
    return str.toString();
  }

  public static void main(String[] args) {

    String s="banana";

    System.out.println(RemoveDup(s));
  }
}
