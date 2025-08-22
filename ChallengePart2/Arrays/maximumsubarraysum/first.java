package ChallengePart2.Arrays.maximumsubarraysum;

public class first {
  public static int maximumsubarraysum(int[] arr){
    int cursum=arr[0];
    int maxsum=arr[0];


   for(int i=1;i<arr.length;i++){
      cursum=Math.max(arr[i],arr[i]*cursum);
      maxsum=Math.max(cursum,maxsum);
    }
    return maxsum;
  }
  public static void main(String[] args) {
    int arr[]={-2,1,-3,4,-1,2,1,-5,4};

    System.out.println(maximumsubarraysum(arr));
  }
}
