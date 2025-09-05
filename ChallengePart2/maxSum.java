
package ChallengePart2;
import java.util.*;
public class maxSum {
public static void main(String[] args) {
  int[] nums={-2,1,-3,4,-1,2,1,-5,4};
  int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        int cursum=0;
        for(int j=i;j<n;j++){
                      cursum+=nums[j];
            //System.out.println(cursum);
            maxsum=Math.max(maxsum,cursum);
            //System.out.println(maxsum);
        }
      } 
      System.out.println("maxsum"+maxsum);
}
}
