package ChallengePart2.Strings.Vowelsconstant;

public class first {

  public static int[] checking(String s){
    int vowels=0;
    int consonants=0;

    for(char c:s.toCharArray()){
      if(c==' '){
        continue;
      }
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        vowels++;
      }else{
        consonants++;
      }
    }
    return new int[] {vowels,consonants};
  }
  public static void main(String[] args) {
    String s="Maneesh Gowda";

   int[] arr=checking(s);

   System.out.println("Vowels:"+arr[0]);
   System.out.println("consonants:"+arr[1]);
  }
}
