package RotateArray;

public class rotate1 {

  public static int[] rotate(int[] arr,int k){
    int[] new_arr=new int[arr.length];
    int n=arr.length;
    for(int i=0;i<arr.length;i++){
      new_arr[(i+k)%n]=arr[i];
    }

    return new_arr;
  } 



  public static void rotate2(int[] nums,int k){
    for(int i=0;i<k;i++){
      int temp=nums[nums.length-1];
      for(int j=nums.length-2;j>=0;j--){
        nums[j+1]=nums[j];
      }
      nums[0]=temp;
    }
  }


  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int k=2;
    int[] new_arr=rotate(arr, k);
    for(int num:new_arr){l
      System.out.print(num+" ");
    }

    rotate2(arr, k);
    System.out.println();

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
