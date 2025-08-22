package ChallengePart2.Strings.countfreq;
import java.util.*;
public class first {
  public static Map<Character,Integer> CountChar(String s){
    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    return map;
  }
  public static void main(String[] args) {
    String s="Helloworld";

    System.out.println(CountChar(s));
  }
}
