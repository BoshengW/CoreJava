package JavaSE.Collection;

public class MyDoublyLinkedList {
    public class Node {
        private Node prev;
        private Node next;
        private Object val;

        public Node() {

        }
        public Node(Object val) {
//            this.prev = prev;
//            this.next = next;
            this.val = val;

        }
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setVal(Object val) {
            this.val = val;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public Object getVal() {
            return val;
        }

    }

    private Node first;
    private Node last;
    private int size;

    public MyDoublyLinkedList() {

    }

    // insertion time complexity O(1);
    // since we use last save final element
    public void add(Object obj) {
        // if Linkedlist is empty
        if (first==null) {
            Node newNode = new Node(obj);
            newNode.setPrev(null);
            newNode.setNext(null);
            last = first = newNode;
        } else {
            // Linkedlist has value
            Node newNode = new Node(obj);
            // Doubly Linkedlist has two pointer
            newNode.setPrev(last);
            newNode.setNext(null);
            last.setNext(newNode);
            last = newNode;
        }
        size++;

    }
    public void delete() {
        // check if linked list is empty
        // time complexity O(1)
        if(first==null) {
            System.out.println("list is empty");
        } else {
            last = last.getPrev();
            last.setNext(null);
            size--;
        }

    }

    public void delete(int index) {
        if(rangeCheck(index)) {
            Node temp = new Node(null);
            temp = first;
            // traverse
            for (int i=0;i<index-1;i++) {
                temp = temp.getNext();
            }
            // delete last node
            // last need to change
            // this case include when linked list has only one element
            // else which mean temp.getNext() has value
            if (index==size-1) {
                temp.setNext(null);
                last = temp;
            }
            // delete first node this case
            else {
                if (index==0) {
                    temp = temp.getNext();
                    temp.setPrev(null);
                    first = temp;
                }
                else {
                    // means index between first and last
                    // and first last is two different node
                    // cut linked list has order
                    temp.getNext().getNext().setPrev(temp);
                    temp.setNext(temp.getNext().getNext());

                }
            }
            size--;
        } else {
            System.out.println("Index out of bound.");
        }

    }

    public boolean rangeCheck(int index) {
        if(index>=size || index<0) {
            return false;
        } else {
            return true;
        }
    }

    public Object getVal(int index) {
        if(rangeCheck(index)) {
            Node temp = new Node(null);
            temp = first;
            for(int i=0;i<index;i++) {
                temp = temp.getNext();
            }
            return temp.getVal();
        } else {
            System.out.println("Index out of bound");
            return null;
        }
    }

    public void print() {
        Node temp = new Node(null);
        temp = first;
        for(int i=0;i<size;i++) {
            System.out.println(temp.getVal());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList dllist = new MyDoublyLinkedList();
        dllist.add(5);
        dllist.add("s");
        dllist.add("123");
        dllist.add("1234");

        dllist.delete();
        dllist.print();
        System.out.println(dllist.getVal(0));
    }
}
