package LinkedList;

public class LinkedList {

    Node head;

    public void append(int data){
        Node current=head;
        if(head==null){
            head=new Node(data);
            return;
        }
        current=head;
        while(current.next!=null){
            current=current.next;
        }

        current.next=new Node(data);
    }

    public void prepend(int data){
        Node newHead=new Node(data);
        newHead.next=head;
        head=newHead;
    }

    public Node delete(int value){

        if(head.data==value){
            return head.next;
        }

        Node current=head;

        while(current.next.data!=value){
            current=current.next;
        }

        if(current.next.data==value){
            current.next=current.next.next;
        }

        return head;
    }

    public void print(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }

}
