
public class bruteSubstringwithoutrep {
  public static void main(String[] args) {
    String s="leetcode";

    for(int i=0;i<s.length();i++){
      for(int j=i;j<s.length();j++){
        String sub="";
       for(int k=i;k<=j;k++){
        sub+=s.charAt(k);
       }
        System.out.println(sub);
      }
      System.out.println();
    }
  }
}