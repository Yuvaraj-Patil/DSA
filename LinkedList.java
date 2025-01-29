class Node{
    public int value;
    public Node next;
    Node(int val)
    {
        value=val;
        next=null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        
    }

    public static boolean searchValue(Node head, int K)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.value==K)
                return true;
            temp=temp.next;
        }
        return false;
    }

    public static Node delete(Node head, int K)
    {
        Node temp=head;
        if(head==null)
            return null;
        if(head.value==K)
        {

        }
        while(temp.next!=null)
        {
            if(temp.next.value==K)
            {
                Node t=temp.next;
                temp.next=t.next;
                t.next=;
                return head;
            }
            temp=temp.next;
        }
    }
}
