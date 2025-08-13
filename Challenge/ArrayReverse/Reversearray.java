package ArrayReverse;
import java.util.*;
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



  // by inplace

  public static int[] byinplacereverse(int[] arr) {
    int left=0;
    int right=arr.length-1;

    while(left<right){
      int temp=arr[left];
    arr[left]=arr[right];
  arr[right]=temp;

  left++;
  right--;
    }
    return arr;
  }

//by using stack

public static int[] byusingStack(int[] arr) {
  Stack<Integer> stack =new Stack<>();
  for(int num:arr){
  stack.push(num);
  }
  for(int i=0;i<arr.length;i++){
    arr[i]=stack.pop();
  }
  return arr;
}
  public static void main(String[] args) {
    int arr[]={1,2,3,4};

    int nums[]={5,7,8,9};

    int[] new_arr=reversed(arr);
    int[] in_arr=byinplacereverse(arr);

    int[] new_nums=byusingStack(nums);

    for(int i=0;i<arr.length;i++){
      System.out.print(new_arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<arr.length;i++){
      System.out.print(in_arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<nums.length;i++){
      System.out.print(new_nums[i]+" ");
    }

   
  }
}



// by inplace





