package ChallengePart2.Hackerrank;

import java.util.ArrayList;

public class FunnyString {
  
  public static void funnyString(String[] args) {


    new ArrayList<>();
    // Write your code here
    String s="argb";
    int count=1;
    for(int i=1;i<s.length();i++){
        if(((s.charAt(i)-'0')-(s.charAt(i-1)-'0'))==1){
            count++;
        }
    }
    if(count==s.length()){
        System.out.println("Funny");
    }
     System.out.println("Not funny");
    }

}

