package JavaSE.Collection;
import java.util.ArrayList;

public class MyHashTable<K,V> {
    // HashSet is implemented by Arraylist + element is a linked list.
    // hash table is used to fetch,
    /*
    Hash table stores data in form of (key, value) combination
    Note:
        1. Each Key must be unique
        2. Each Value can be duplicate
        3. Fetch a value by key / index can be O(1).
    Difference with Array:
        Array, we provide position/index to value
        HashTable/Map, we provide key to value.
    Every time a key is generated, the key is passed to a hash function.
        Hash Function: Hash code + Compressor

    * */
    // seperate chaining
    /*
    why use this?
        Collision: two keys resulting in same value.
        Ex. Hash function h(x) = x % 7
         -> x = 11 , x = 18 h(x) both are 4.
        Handling Collision
            1. Seperate chaining
                To make each cell of hash table point to a linked list of records
                that have same hash function value.
                ex. 50, 85, 92 hashcodes are 1
                    1 : 50 -> 85 -> 92
                Advantages:
                    1). Simple to implement
                    2). Hash Table never fills up, we can always add more element to chain
            2. Open addressing

    * */
    // A node of chain
    public class HashNode<K,V> {
        // generic
        K key;
        V value;

        // Reference to next node
        HashNode<K,V> next;
        public HashNode(K key,V value) {
            this.key = key;
            this.value = value;
        }
    }

    // bucketArray is used to store array of chains
    private ArrayList<HashNode<K,V>> bucketArray;

    // Current capacity of array list
    private int numBuckets;

    // Current size of array list
    private int size;

    public MyHashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        // create empty chains
        // Basic hashtable is made by arraylist+linked list, for each element in llist, make a null as head
        for(int i=0;i<numBuckets;i++) {
            bucketArray.add(null);
        }
    }
    // This implements hash function to find index
    // for a key
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return -1;

    }
    // access operation get()
    // Access operation time complexity can be O(1) only when
    //  1. equally compared in O(1) time ; 2. There will be few hash collisions (since traverse collisions also take time)

    public V remove(K key) {
        // apply key into hash function
        int bucketIndex = getBucketIndex(key);

        // get head of chain
        HashNode<K,V> head = bucketArray.get(bucketIndex);
        HashNode<K,V> prev = null;
        // find where is the key
        while(head!=null) {
            if(head.key.equals(key)) {
                // remove this
                break;
            }
            prev = head; // save current node
            head = head.next;
        }
        size--;
        // if key not exist
        if (prev!=null) {
            prev.next = head.next;
        } else {
            // key exist
            bucketArray.set(bucketIndex,head.next);
        }
        return head.value;
    }

    // most challenge method
    public void add(K key,V value) {
        // find head of chain for given key
        int bucketIndex = getBucketIndex(key); // hash the key Note: different key might have same hashindex
        HashNode<K,V> head = bucketArray.get(bucketIndex);
        // if bucketindex not in bucketarray is it throw error?
        // each hashNode save key+value
        // Now check key exist
        while(head!=null) {
            if (head.key.equals(key)) {
                // if key exist then overwrite the value.
                head.value = value;
                return;
            }
            head = head.next;
        }

        //
        size++;
        head = bucketArray.get(bucketIndex); // reset head
        HashNode<K,V> newNode = new HashNode<K,V>(key,value);
        newNode.next = head; // put newNode on top
        bucketArray.set(bucketIndex, newNode);

        // if load factor goes beyond threshold, then double hash table size
        if ((1.0*size)/numBuckets>=0.7) {
            ArrayList<HashNode<K,V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = numBuckets*2;
            size = 0;
            for (int i=0;i<numBuckets;i++) {
                bucketArray.add(null);
            }
            // copy previous Linked list element into new Arraylist
            for (HashNode<K,V> headNode: temp) {
                while (headNode != null) {
                    // copy linked list can not directly use "="
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public static void main(String[] args) {
        String var = new String("ksda");
        System.out.println(var.hashCode());
    }
}
