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
    public void add(int position , T data){ 
        if(position <1 || position > length+1)
        {
            System.out.println("Invalid Position");
            return;
        }
        if (position==1)
        {
            Node<T> temp = head;
            head = new Node<>(data);
            head.next = temp;
            length++;
            return;
        }
        Node<T> current = head;
        for(int i=0;i<position-1;i++)
        {
            current = current.next;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = current.next;
        current.next = newNode;
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
}
