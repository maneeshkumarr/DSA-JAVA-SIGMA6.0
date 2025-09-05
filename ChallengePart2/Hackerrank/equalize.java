package ChallengePart2.Hackerrank;

import java.util.*;
public class equalize {
  public static void main(String[] args) {

    List<Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(2);
    arr.add(8);

    Map<Integer,Integer> map=new HashMap<>();
    
    int max=0;
    for(int i=0;i<arr.size();i++){
        map.put(arr.get(i),map.getOrDefault(map.get(i), 0)+1);
    }
    
    for(int i=0;i<arr.size();i++){
        if(map.get(arr.get(i))>max){
            max=map.get(arr.get(i));
        }
    }

    System.out.println(10);
  }
}
