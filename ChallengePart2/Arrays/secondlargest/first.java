package ChallengePart2.Arrays.secondlargest;

public class first {

  public static int  secondlargest(int[] arr) {

    int largest=Integer.MIN_VALUE;
    int slargest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        slargest=largest;
        largest=arr[i];
      }else if(arr[i]>slargest && arr[i]!=largest){
        slargest=arr[i];
      }
    }
    return slargest;
  }
  public static void main(String[] args) {
    int arr[]={5,6,3,2,7};

    System.out.println(secondlargest(arr));
  }
}
