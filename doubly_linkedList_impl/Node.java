public class Node extends DoublyLinkedList
{
  int data;
  Node next;
  Node prev;
  public Node(int data)
  {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
