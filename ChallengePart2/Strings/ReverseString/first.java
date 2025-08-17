package ChallengePart2.Strings.ReverseString;

public class first {

  public static String Reverse(String str){
    String s="";
    int n=str.length();

    for(int i=n-1;i>=0;i--){
      s+=str.charAt(i);
    }
    return s;
  }
  public static void main(String[] args) {
    String str="Hello";
    System.out.println(Reverse(str));
  
  }
}
