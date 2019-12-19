package JavaSE.DataStructure;
import java.util.*;

// implement Queue based on Stack
public class QueueByStack {
    private Stack myStack1;
    private  Stack myStack2;

    public QueueByStack() {
        myStack1 = new Stack();
        myStack2 = new Stack();
    }

    public void add(Object obj) {
        // put one stack to another stack
        // can be reverse order of stack
        myStack1.add(obj);
    }

    public void dequeue() {
        // remove the top element
        // in Stack, pop only can remove bottom element
        for(int i=0;i<myStack1.size()-1;i++) {
            myStack2.push(myStack1.pop()); // reverse order
        }
        myStack1.clear();
        for(int j=0;j<myStack2.size();j++) {
            myStack1.push(myStack2.pop());
        }

    }
    public int size() {
        return myStack1.size();
    }
    public void print() {
        System.out.println(myStack1);
    }

    public static void main(String[] args) {
        QueueByStack myQue = new QueueByStack();
        myQue.add("s");
        myQue.add(4);
        myQue.print();
        myQue.dequeue();
        myQue.print();
    }
}
