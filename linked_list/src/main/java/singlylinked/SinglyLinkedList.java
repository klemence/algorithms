package singlylinked;

public class SinglyLinkedList {

  private Node headNode;
  private Node tailNode;
  private int count;

  public Node getHeadNode() {
    return this.headNode;
  }
  public Node getTailNode() {
    return this.tailNode;
  }

  public int getCount() {
    return count;
  }

  public void insertNode (Node node){
    if(node == null) {
      return;
    }
    if (this.headNode != null) {
      this.tailNode.setNextNode(node);
      this.tailNode = node;
    } else {
      this.headNode = node;
      this.tailNode = node;
    }
    this.count++;
  }

  public void deleteNode(Node node) {
    if (node == null || this.headNode == null) {
      return;
    }

    Node currNode = this.headNode;
    if (currNode.getId().equals(node.getId())) {
      this.headNode = null;
      this.tailNode = null;
    } else {
      Node nextNode = currNode.getNextNode();
      while (nextNode != null) {
        if(nextNode.getId().equals(node.getId())) {
          currNode.setNextNode(nextNode.getNextNode());
          return;
        } else {
          currNode = nextNode;
        }
        nextNode = nextNode.getNextNode();
      }
    }
  }
}