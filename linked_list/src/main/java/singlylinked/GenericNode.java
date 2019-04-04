package singlylinked;

public class GenericNode <T> {
  private GenericNode<T> nextNode;
  private T data;
  public T getData() {
    return this.data;
  }
  public GenericNode (T data) {
    this.data = data;
  }
  public GenericNode<T> getNextNode(){
    return nextNode;
  }
  public void setNextNode(GenericNode<T> node) {
    this.nextNode = node;
  }
}

