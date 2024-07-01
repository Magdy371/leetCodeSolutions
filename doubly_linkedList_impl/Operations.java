public class Operations extends DoublyLinkedList
{
  public void insertAtTheBegining(int data)
  {
    Node n = new Node(data);
    n.next = head;
    n.prev = null;
    if(head !=null)
    {
      head.prev = n;
    }
    head = n;
    if(tail==null)
    {
      tail = n;
    }
  }
}
