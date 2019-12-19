package JavaSE.Collection;

// For nested class: inner class can access outer class private member
public class MySingleLinkedList {

    // single linked list
    public class Node {
        private Object val;
        private Node next;

        public Node() {

        }

        public Node(Object val) {
            this.val = val;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setVal(Object val) {
            this.val = val;
        }
        public Node getNext() {
            return next;
        }
        public Object getVal() {
            return val;
        }


    }

    private Node head;
    private Node tail;
    private Object val;
    private int size;

    public MySingleLinkedList() {

    }

    public int size() {
        return size;
    }

    public void add(Object val) {
        // check if linked list is empty
        if(head==null) {
            Node newNode = new Node(val);
            newNode.next = null;
            tail = head = newNode;
        } else {
            Node newNode = new Node(val);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void topDelete() {
        // check if linked list is empty
        // For single linked list, only delete the top element can be O(1)
        // if you want to delete specific element inside or last element, you still need O(n)
        if(head==null) {
            System.out.println("list is empty");
        } else {
            head = head.next;
            size--;
        }

    }

    public void delete(int index) {
        if (indexCheck(index)) {
            Node temp = new Node();
            temp = head;
            // check if list
            for (int i=0;i<index-1;i++) {
                temp = temp.next;
            }
            // check tail remove or not
            if (index==size-1) {
                temp.next = null;
                tail = temp;
            // check head need to remove or not
            } else if (index==0) {
                head = head.next;

            // normal case, rm element between head & tail
            } else {
                temp.next = temp.next.next;

            }
            size--;
        } else {
            System.out.println("Index out of bound");
        }

    }

    public void print() {
        Node temp = new Node();
        temp = head;
        for (int i=0;i<size;i++) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public boolean indexCheck(int index) {
        if (index<0 || index>=size) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        MySingleLinkedList sllist = new MySingleLinkedList();
        sllist.add("s");
        sllist.add(5);
        sllist.add(0.001f);
        sllist.delete(0);
        sllist.print();
    }

}
