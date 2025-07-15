public class Maxsubsum {
  public static void main(String[] args) {
    int arr[]={-2,4,-2,7,-4};
    int n=arr.length;
    int maxsum=arr[0];
    int cursum=arr[0];

    for(int i=0;i<n;i++){
      cursum=Math.max(arr[i],cursum+arr[i]);

      maxsum=Math.max(cursum,maxsum);
    }
    System.out.println("maximum sum:"+maxsum);
  }
}
