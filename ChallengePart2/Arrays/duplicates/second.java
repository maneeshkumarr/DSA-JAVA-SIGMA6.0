package ChallengePart2.Arrays.duplicates;

import java.util.HashSet;

public class second {

  public static int duplicates(int arr[]){
   
    HashSet<Integer> set=new HashSet<>();

    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])){
        return arr[i];
      }else{
        set.add(arr[i]);
      }
    }
    return -1;
  }
  public static void main(String[] args) {
     int arr[]={1,2,4,2,6};

    System.out.println(duplicates(arr));
  }
}
