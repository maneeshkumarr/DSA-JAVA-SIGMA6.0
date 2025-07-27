package Challenge;

public class validAnagram {
  public static void main(String[] args) {
    String str1="anagram";
    String str2="nagaram";

    int[] arr=new int[26];

    if(str1.length()!=str2.length()){
      System.out.println(" not a anagram");
    }else{
      System.out.println("anagram");
    }

    for(int i=0;i<str1.length();i++){
      arr[str1.charAt(i)-'a']++;
       arr[str2.charAt(i)-'a']--;
    }

    for(int i=0;i<str1.length();i++){
    if(arr[i]!=0){
      System.out.println(" not anagram");
    }else{
      System.out.println(" anagram");
    }
  }
  }
}
