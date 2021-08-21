package linkedlist;

public class MyDoublyLinkedList<ne> {
    Node<ne> head;

    public MyDoublyLinkedList() {
        head = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public ne get(int index) {
        Node<ne> temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new NullPointerException("Index value is too large");
        }
        return temp.data;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(ne val) {
        Node<ne> toAdd = new Node<>(val);
        if (head == null) {
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head.prev = toAdd;
        head = toAdd;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(ne val) {
        Node<ne> toAdd = new Node<>(val);
        if (head == null) {
            head = toAdd;
            return;
        }
        Node<ne> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
        toAdd.prev = temp;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, ne val) {
        Node<ne> temp = head;
        int i = 0;
        for (; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null && i < index - 1) {
            throw new NullPointerException("Index value is too large");
        }
        Node<ne> toAdd = new Node<>(val);
        toAdd.prev = temp;
        toAdd.next = temp.next;
        temp.next.prev = toAdd;
        temp.next = toAdd;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node<ne> temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            temp.next.prev = temp;
        } else {
            throw new NullPointerException("Index value is too large");
        }

    }

    public void print() {
        Node<ne> temp = head;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    /**
     * Initialize your data structure here.
     */

    public static class Node<ne> {
        public ne data;
        public Node<ne> prev, next;

        public Node(ne data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
}

/*
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

