package ChallengePart2.Strings.ReverseString;

public class third {

  public static String Reverse(String str){
    StringBuilder sb=new StringBuilder(str);
    return sb.reverse().toString();
  }
  public static void main(String[] args) {

    String str="Shashidhara";
    System.out.println(Reverse(str));
  }
}
