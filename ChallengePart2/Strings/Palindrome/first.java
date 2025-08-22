package ChallengePart2.Strings.Palindrome;

public class first {

  public static boolean Palindrome(String s){
    StringBuilder str=new StringBuilder(s);
    String original=str.toString();
    String reversed=str.reverse().toString();

    if(original.equals(reversed)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String s="mada";

   if(Palindrome(s)){
    System.out.println("yes its palindrome");
   }else{
    System.out.println("No its not");
   }
  }
}
