package JavaSE.Collection;

public class MyStack {

    // Stack is Last in First out
    private int size;
    private MyDoublyLinkedList elementData; // create a new object you need to use new

    public MyStack() {
        elementData = new MyDoublyLinkedList();
    }

    public void add(Object obj) {
        elementData.add(obj);
        size++;
    }

    public void pop() {
        elementData.delete();
        size--;
    }

    public void search(int index) {
        if(elementData.rangeCheck(index)){
            elementData.getVal(index);
        } else {
            System.out.println("Index out of bound");
        }

    }

    public void print() {
        elementData.print();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.add(5);
        stack.add("3");
        stack.add("star");
        stack.print();
        stack.pop();
        stack.print();

    }

}
