package JavaSE.Collection;

public class MyQueue {

    private MyDoublyLinkedList elementData;
    private int size;

    public MyQueue() {
        elementData = new MyDoublyLinkedList();
    }

    public void enqueue(Object obj) {
        elementData.add(obj);
        size++;
    }

    public void dequeue() {
        elementData.delete(0);
        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        elementData.print();
    }

    // search(int index)
    // set(int index, Object val);
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("s");
        queue.enqueue(5);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
