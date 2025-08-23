package ChallengePart2.LinkedList.nodecreation;

public class Main {
  public static void main(String[] args) {
    Linkedlistcreation llk=new Linkedlistcreation();

    llk.insertEnd(4);
    llk.insertEnd(6);
    llk.insertEnd(7);
    llk.insertEnd(8);
    llk.display();

    System.out.println();

    llk.DeletebyVal(6);
     llk.display();

  }
}
