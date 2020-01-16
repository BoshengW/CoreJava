package JavaSE.Collection;


import java.util.ArrayList;

public class MyGeneralTree {

    static class Node {
        public int key;
        public ArrayList<Node> child = new ArrayList<>();
        public Node(int key){
            this.key=key;
        }
    }
    static class GeneralTree{
        Node root;
        public GeneralTree(Node rootNode) {
            this.root.key = rootNode.key;
            this.root.child = rootNode.child;
        }

        public void addNewNode(Node injectPoint, Node newNode) {
            injectPoint.child.add(newNode);
        }


        public String Dfs(Node currNode, int level) {
            //
            System.out.println("level: " + currNode.key);
            for(Node c: currNode.child) {
                Dfs(c,level+1);
            }
            return "";

        }

        public void displayTreeInDFS() {
            String a = Dfs(root, 0);
        }

        public void displayTreeBFS() {

        }
    }




    public static void main(String[] args) {
        Node FirstNode = new Node(0);
        MyGeneralTree.GeneralTree myTree = new MyGeneralTree.GeneralTree(FirstNode);
        Node Second = new Node(1);
        Node Third = new Node(2);
        myTree.addNewNode(myTree.root, Second);
        myTree.addNewNode(myTree.root, Third);
        myTree.displayTreeInDFS();

    }

}
