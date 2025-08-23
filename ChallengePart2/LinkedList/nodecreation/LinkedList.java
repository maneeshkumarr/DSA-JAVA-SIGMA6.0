package ChallengePart2.LinkedList.nodecreation;

public class LinkedList {
  static Node head;

  public static void main(String[] args) {
    //LinkedList list=new LinkedList();
    
    head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);

    //connecting them

    head.next=second;
    second.next=third;

    Node temp=head;

    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.print("null");
  }
}
