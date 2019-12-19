package JavaSE.DataStructure;
import JavaSE.Collection.MyQueue;
public class StackByQueue {
    private MyQueue q1;
    private MyQueue q2;

    public StackByQueue() {
        q1 = new MyQueue();
        q2 = new MyQueue();
    }

//    public void push(Object obj) {
//        q2.enqueue(obj);
//
//        while(q1.size()>0) {
//            q2.enqueue(q1.peek()); // return top element
//            q1.dequeue();
//        }
//        MyQueue q = new MyQueue();
//        q = q1;
//        q1 = q2;
//        q2 = q;
//    }
//
//    public void pop() {
//        while(q1.size()>1) {
//            q2.enqueue(q1.peek);
//            q1.dequeue();
//        }
//        // leave the last one in p1
//        MyQueue tempq = new MyQueue();
//        q1 = q2;
//        q2 = tempq;
//
//    }

}
