package ChallengePart2.Arrays.missingnumber;

public class first {
  public static int missingNumber(int[] arr){
    int asum=0;
    int n=arr.length+1;

    int sum=n*(n+1)/2;

    for(int i=0;i<arr.length;i++){
      asum+=arr[i];
    }
    return sum-asum;
  }
  public static void main(String[] args) {

    int arr[]={1,2,3,4,6,7,8};
    System.out.println(missingNumber(arr));
  }
}
