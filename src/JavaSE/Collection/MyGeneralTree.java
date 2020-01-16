package JavaSE.Collection;


import java.util.*;

public class MyGeneralTree {

    static class Node {
        int key;
        Vector<Node> child = new Vector<>();
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        return temp;
    }
    static String Dfs(Node currNode, int level) {
        System.out.println("level: " + level + ",value:" + currNode.key);
        for(Node c: currNode.child) {
            Dfs(c, level+1);
        }
        return "";
    }

    static String BfsIter(Node root) {
        Queue<Node> q = new LinkedList<>();
        Queue<Node> s = new LinkedList<>();
        if(root!=null) {
            q.add(root);
            s.add(root);
        }
        int level = 0;
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            for(Node c: currNode.child) {

                if(c!=null) {
                    q.add(c);
                    s.add(c);
                }
            }
        }
        for(Node m: s) {
            System.out.println(m.key);
        }
        return "";
    }

    static void displayTreeInDFS(Node root) {
        if(root==null) return;
        Dfs(root, 0);

    }

//        public void displayTreeInDFS() {
//            String a = Dfs(root, 0);
//        }

//        public void displayTreeBFS() {
//
//        }
    public static void main(String[] args) {
        Node root = newNode(10);
        root.child.add(newNode(2));
        root.child.add(newNode(34));
        root.child.add(newNode(56));
        root.child.add(newNode(100));
        // first child node "2"
        root.child.get(0).child.add(newNode(77));
        displayTreeInDFS(root);
        BfsIter(root);
    }

}
