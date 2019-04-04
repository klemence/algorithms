package singlylinked;

public class Node {
  private String name;
  private Integer id;
  private Node nextNode;
  public String getName() {
    return this.name;
  }
  public Integer getId() {
    return this.id;
  }

  public Node (String name, Integer id) {
    this.name = name;
    this.id = id;
  }
  public Node getNextNode(){
    return nextNode;
  }
  public void setNextNode(Node node) {
    this.nextNode = node;
  }
}
