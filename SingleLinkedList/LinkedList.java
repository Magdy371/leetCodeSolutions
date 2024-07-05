public class LinkedList <T>{
    public Node<T> head;
    public int length;
    public LinkedList()
    {
        this.head= null;
        this.length=0;
    }
    //insertion operation
    @SuppressWarnings("null")
    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
        {
            head = newNode;
        }else{
            Node<T> current = head;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }
    public String toString()
    {
        StringBuilder result = new StringBuilder("{");
        Node<T> current = head;
        while(current!=null)
        {
            result.append(current.data).append("->");
            current= current.next;
        }
        result.append("null }");
        return result.toString();
    }
    public void remove(T key)
    {
        Node<T> prev = null;
        Node<T> current = head;
        while(current!=null)
        {
            if(current.data.equals(key))
            {
                if(prev == null)
                {
                    head = current.next;
                }else{
                    prev.next= current.next;
                }
                length--;
                return;
            }
            prev = current;
            current= current.next;
        }
        System.out.println("the value not found");
    }
    public void clear()
    {
        head = null;
        length = 0;
    }
}
