package ChallengePart2.Searching;

public class binarysearch {
  
  public static int[] binarysearch(int[] arr,int key){
    int left=0;
    int right=arr.length-1;


    while(left<=right){
      int mid=(right+left)/2;

      if(arr[mid]==key){
        return new int[] {mid,key};
      }else if(arr[mid]>key){
        right=mid-1;
      }else{
        left=mid+1;
      }
    }
    return new int[0];
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int[] index=binarysearch(arr, 6);

    System.out.println( "element "+index[1]+" found at "+index[0]+" position");
  }
}
