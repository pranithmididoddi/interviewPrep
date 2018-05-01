package LinkedList;

public class Main {

    public static void main(String[] args){

        LinkedList linkedList=new LinkedList();
        linkedList.append(7);
        linkedList.append(8);
        linkedList.prepend(6);
        linkedList.delete(7);
        linkedList.print();
    }
}
