package ChallengePart2.Strings.ReverseString;

public class second {

  public static void reverse(StringBuilder str){
    int left=0;
    int right=str.length()-1;
    while(left<right){
      char temp=str.charAt(left);
      str.setCharAt(left,str.charAt(right));
      str.setCharAt(right,temp);
      left++;
      right--;
    }
  }
    public static void main(String[] args) {
    StringBuilder str=new StringBuilder("Maneesh");
    reverse(str);
    System.out.println(str);
  }
}
