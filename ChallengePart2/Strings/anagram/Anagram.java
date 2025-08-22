package ChallengePart2.Strings.anagram;

public class Anagram {

  public static boolean Anagram(String s1,String s2){
    int[] freq=new int[26];
    for(int i=0;i<s1.length();i++){
      freq[s1.charAt(i)-'a']++;
      freq[s2.charAt(i)-'a']--;
    }
    for(int i=0;i<freq.length;i++){
      if(freq[i]!=0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String s1="janam";
    String s2="namj";
    
    if(Anagram(s1, s2)){
      System.out.println("Yeah its anagram..");
    }else{
      System.out.println("Nooooo");
    }
  }
}
