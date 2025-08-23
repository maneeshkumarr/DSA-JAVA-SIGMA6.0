package ChallengePart2.LinkedList.nodecreation;

public class Linkedlistcreation {
  Node head;

  public  void insertEnd(int data) {
    Node newnNode=new Node(data);
    if(head==null){
      head=newnNode;
      return;
    }

Node temp=head;
while(temp.next!=null){
  temp=temp.next;
}
temp.next=newnNode;
  
  }


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

    if(temp.next!=null){
      temp.next=temp.next.next;
    }
  }
  
  public void display() {
     if(head==null){
     System.out.println("null");
      return;
    }

    Node temp=head;

    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.print("null");
  }
}
