package JavaSE.DataStructure;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;

// This class is implemented Stack based on Queue
public class UseStack{


    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println(myStack.empty());

        myStack.push(5);
        myStack.push("s");

        System.out.println(myStack.elementAt(1));
        myStack.pop();



    }
}
