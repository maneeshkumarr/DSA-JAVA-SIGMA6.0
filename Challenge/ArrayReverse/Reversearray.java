package ArrayReverse;
public class Reversearray {

  public static int[] reversed(int[] arr){
    int[] new_arr=new int[arr.length];
    int j=arr.length-1;
    for(int i=0;i<arr.length;i++){
      new_arr[i]=arr[j];
      j--;

    }
    return new_arr;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4};

    int[] new_arr=reversed(arr);

    for(int i=0;i<arr.length;i++){
      System.out.print(new_arr[i]+" ");
    }
  }
}



