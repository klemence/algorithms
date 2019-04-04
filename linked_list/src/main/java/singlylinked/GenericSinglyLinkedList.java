package singlylinked;

public class GenericSinglyLinkedList<T> {
  private GenericNode<T> headNode;
  private GenericNode<T> tailNode;
  private int count = 0;

  public T getFirst() {
    return this.headNode.getData();
  }
  public T getLast() {
    return this.tailNode.getData();
  }

  public int count() {
    return count;
  }

  public GenericNode<T> getIterator() {
    return headNode;
  }
  public void add (T item){
    if(item == null) {
      return;
    }
    GenericNode<T> node = new GenericNode<T>(item);
    if (this.headNode != null) {
      this.tailNode.setNextNode(node);
      this.tailNode = node;
    } else {
      this.headNode = node;
      this.tailNode = node;
    }
    this.count++;
  }

  public void deleteNode(T data) {
    if (data == null || this.headNode == null) {
      return;
    }
    GenericNode<T> node = new GenericNode<T>(data);
    GenericNode<T> currNode = this.headNode;
    if (currNode.getData().equals(node.getData())) {
      this.headNode = null;
      this.tailNode = null;
    } else {
      GenericNode<T> nextNode = currNode.getNextNode();
      while (nextNode != null) {
        if(nextNode.getData().equals(node.getData())) {
          currNode.setNextNode(nextNode.getNextNode());
          return;
        } else {
          currNode = nextNode;
        }
        nextNode = nextNode.getNextNode();
      }
    }
    count--;
  }
}
