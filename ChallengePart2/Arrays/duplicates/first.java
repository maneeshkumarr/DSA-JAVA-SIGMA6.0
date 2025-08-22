package ChallengePart2.Arrays.duplicates;

public class first {

  public static int duplicates(int arr[]){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          return arr[i];
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={1,2,4,2,6};

    System.out.println(duplicates(arr));
  }
}
