package Challenge;
class Candies{

  public static int totalCandies(int[] candies,int k){
    int total=0;
    for(int i=0;i<candies.length;i++){
      int val=0;
      while(i<candies.length && val<3){
        total+=candies[val];
        val++;
      }
    }
  }
  public static void main(String[] args) {
    int candies[]={2,1,5,1,3,2};
    int k=3;
    System.out.println();
  }
}