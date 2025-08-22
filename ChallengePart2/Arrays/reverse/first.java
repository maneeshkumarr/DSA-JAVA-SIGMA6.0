package ChallengePart2.Arrays.reverse;

public class first {

  public static void reverse(int[] a){
    int left=0;
    int right=a.length-1;

    while(left<right){
      int temp=a[left];
      a[left]=a[right];
      a[right]=temp;

      left++;
      right--;
    }
  }
  public static void main(String[] args) {
    int[] arr={6,7,4,6,7};

    reverse(arr);

    for(int a:arr){
     System.out.print(a+" ");
    }
  }
}
