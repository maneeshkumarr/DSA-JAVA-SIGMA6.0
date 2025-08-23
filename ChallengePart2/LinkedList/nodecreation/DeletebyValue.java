package ChallengePart2.LinkedList.nodecreation;

public class DeletebyValue {
  Node head;
  public  void DeletebyVal(int value) {
    if(head==null){
      return;
    }

    if(head.data==value){
      head=head.next;
      return;
    }

    Node temp=head;

    while(temp.next!=null && temp.next.data!=value){
      temp=temp.next;
    }

    while(temp.next!=null){
      temp.next=temp.next.next;
    }
  }
}
