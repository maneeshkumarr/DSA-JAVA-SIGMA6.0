
package Challenge;
import java.util.*;

public class MoveZero {
  public static void main(String[] args) {
    int arr[]={1,2,0,3,4,0,5,6,0};
    int[] arr2=new int[arr.length];

    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr2[j++]=arr[i];
      }
    }
    for(int i=j;i<arr.length;i++){
      arr2[i]=0;
    }

   for(int i=0;i<arr2.length;i++){
    System.out.print(arr2[i]+" ");
   }
  }
}
