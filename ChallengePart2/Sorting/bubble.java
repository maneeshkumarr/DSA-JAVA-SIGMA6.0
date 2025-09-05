package ChallengePart2.Sorting;

public class bubble {

  public static void bublesort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      boolean swap=false;
      for(int j=0;j<arr.length-1-i;j++){

        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swap=true;
        }
      }
       if(!swap){
        break;
       }
    }
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};


    bublesort(arr);

    for(int num:arr){
      System.out.print(num+" ");
    }
  }
}

//selection sort
