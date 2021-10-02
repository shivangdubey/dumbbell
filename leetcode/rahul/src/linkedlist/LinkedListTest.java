package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) throws NullPointerException {
        MyDoublyLinkedList<Integer> obj = new MyDoublyLinkedList<>();

        obj.addAtHead(7);
        obj.addAtTail(7);
        obj.addAtHead(9);
        obj.addAtTail(8);
        obj.addAtHead(6);
        obj.addAtHead(0);
        obj.print();
        System.out.println(obj.get(5));
        obj.addAtHead(0);
        obj.print();
        System.out.println(obj.get(2));
        System.out.println(obj.get(5));
        obj.addAtTail(4);
        obj.print();
    }

}
