package ChallengePart2.Arrays.mergetwosortedarray;
public class first {

  public static int[] mergetwosortedarray(int[] arr1,int[] arr2){
    int n=arr1.length;
    int m=arr2.length;
    int val=0;
    int[] ans=new int[n+m];
    for(int i=0;i<n;i++){
      ans[i]=arr1[i];
      val=i;
    }
    val=val+1;
     for(int i=0;i<n;i++){
      ans[val++]=arr2[i];
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr1[]={1,3,5};
    int arr2[]={2,4,6};

   int[] ans=mergetwosortedarray(arr1, arr2);


   for(int a:ans){
    System.out.print(a+" ");
   }
  }

}
