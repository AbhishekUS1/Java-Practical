package DSA.LinkedLIsts;

public class linkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head; 
    public static Node tail;
    public void addFirst(int data)
    {
        // Step 1- create new node
        Node newNode =new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        // Step 2- newNode next=head
        newNode.next=head; //link
        //step 3-head=newNode
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
    if(head==null)
    {
        head=tail=newNode;
        return;
    }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(1);
        //ll.head=new Node(1);
        //ll.head.next=new Node(2);
    }
}
