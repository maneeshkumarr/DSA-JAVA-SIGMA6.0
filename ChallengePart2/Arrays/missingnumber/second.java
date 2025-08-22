package ChallengePart2.Arrays.missingnumber;

public class second {

  public static int missingnumber(int[] s){
    int xor1=0;
    int xor2=0;
    for(int i=0;i<s.length;i++){
      xor1^=s[i];

    }
    System.out.println(xor1);
    for(int i=1;i<=s.length+1;i++){
      xor2^=i;
    }

    System.out.println(xor2);
    int ans=xor1^xor2;

    return ans;
  }
  public static void main(String[] args) {
   int arr[]={1,2,3,4,6,7,8}; 

   System.out.println(missingnumber(arr));
  }
}
