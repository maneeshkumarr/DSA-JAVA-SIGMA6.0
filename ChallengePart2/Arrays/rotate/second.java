package ChallengePart2.Arrays.rotate;

public class second {

  public static void reverse(int left,int right,int[] arr){
    while(left<right){
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
  }

  public static void rotate(int[] arr,int k){
    reverse(0, k-1, arr);
    reverse(k, arr.length-1, arr);
    reverse(0, arr.length-1, arr);
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int k=3;
    rotate(arr, k);

    for(int a:arr){
      System.out.print(a+" ");
    }
  }
}
