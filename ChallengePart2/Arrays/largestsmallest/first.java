package ChallengePart2.Arrays.largestsmallest;

public class first {

  public static int[] largestsmallest(int[] arr){
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;

    int[] ans=new int[2];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
      if(arr[i]<min){
        min=arr[i];
      }
    }
    ans[0]=max;
    ans[1]=min;
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={2,5,3,6,8,1};
    int[] ans=largestsmallest(arr);

    System.out.println("largest:"+ans[0]);
    System.out.println("Smallest:"+ans[1]);
  }
}
