package ArrayList;
import java.util.ArrayList;

public class practice {

  public static void swap(ArrayList<Integer> list,int idx1,int idx2){
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
  }
  public static void main(String[] args) {
    int max=Integer.MIN_VALUE;
    ArrayList<Integer> list=new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(8);

    System.out.println(list);
    list.remove(2);
    System.out.println(list);
    list.add(2,10);
    System.out.println(list);
    list.set(3,5);
    System.out.println(list);
    System.out.println(list.contains(3));
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    System.out.println();
    for(int i=list.size()-1;i>=0;i--){
      System.out.println(list.get(i));
    }

     for(int i=0;i<list.size();i++){
          if(list.get(i)>max){
            max=list.get(i);
          }
        }

          for(int i=0;i<list.size();i++){
          max=Math.min(list.get(i),max);
    }

    System.out.println("maximum is:"+max);

    System.out.println();
    System.out.println();
    System.out.println();

    int idx1=1;
    int idx2=2;
    System.out.println(list);
    swap(list,idx1,idx2);
    System.out.println(list);
    }
}
