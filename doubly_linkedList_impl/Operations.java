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
  public void traverseForward()
  {
    Node cur = head;
    while(cur!=null)
    {
      System.out.println(cur.data + " ");
      cur = cur.next;
    }
  }
}
