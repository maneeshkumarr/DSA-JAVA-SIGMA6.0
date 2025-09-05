package ChallengePart2.Stack;

import java.util.Stack;

public class validparathes {
  public static boolean paranthesis(String s){

    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch=='{'||ch=='('||ch=='['){
        stack.push(ch);
      }else{
        if(stack.isEmpty()){
          return false;
        }
       char top=stack.pop();
       if(ch=='(' && top!=')'|| ch=='{' && top=='}'||  ch=='[' && top==']'){
        return false;
       }
      }
    }
    return stack.isEmpty();
  }
  public static void main(String[] args) {
    String s="{([]}";
    
    if(paranthesis(s)){
      System.out.println("valid paranthesis");
    }else{
      System.out.println("not a valid");
    }

  }
}
