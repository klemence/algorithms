import singlylinked.GenericNode;
import singlylinked.GenericSinglyLinkedList;
import singlylinked.Node;
import singlylinked.SinglyLinkedList;

public class Application {

  public static void main(String[] arg) {
    //SinglyLinkedList llist = new SinglyLinkedList();
    GenericSinglyLinkedList<String> llist = new GenericSinglyLinkedList<String>();
    populateLinkedList(llist);
    displayLinkedList(llist);
    deleteNode(llist);
    displayLinkedList(llist);
  }

  public static void populateLinkedList(SinglyLinkedList list) {
    for(int i = 0; i <= 10; i++) {
      Node node  = new Node("MyName-" + i, i);
      list.insertNode(node);
    }
  }
  public static void displayLinkedList(SinglyLinkedList list) {
    Node headNode = list.getHeadNode();
    while(headNode != null) {
      String msg = String.format("Name: %s | Id: %d", headNode.getName(), headNode.getId());
      System.out.println(msg);
      headNode = headNode.getNextNode();
    }
  }

  public static void deleteNode(SinglyLinkedList list) {
    Node node = new Node("MyName-5", 10);
    list.deleteNode(node);
  }

  public static void populateLinkedList(GenericSinglyLinkedList<String> list) {
    for(int i = 0; i <= 10; i++) {
      list.add("MyName-" + i);
    }
  }
  public static void displayLinkedList(GenericSinglyLinkedList<String> list) {
    GenericNode<String> iterator = list.getIterator();
    while(iterator != null) {
      String msg = String.format("Name: %s", iterator.getData());
      System.out.println(msg);
      iterator = iterator.getNextNode();
    }
  }

  public static void deleteNode(GenericSinglyLinkedList list) {
    list.deleteNode("MyName-5");
  }
}
