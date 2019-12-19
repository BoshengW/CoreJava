package JavaSE.Collection;

import java.util.Arrays;

public class MyArrayList {
    // fields
    // implement List based on Array data structure.
    private Object[] elementData;
    // this var is used for marking sizeWithElement
    private int sizeWithElement;
    // constructor
        // default
    public MyArrayList() {
        this(10);

    }
        // common
    public MyArrayList(int Capacity) {
        if (Capacity<0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[Capacity];
    }
    // behavior
    // add()
    public void add(Object obj) {
        if (sizeWithElement==elementData.length) {
            Object[] newElementData = new Object[2*sizeWithElement+1];
            System.arraycopy(elementData,0, newElementData, 0, sizeWithElement);
            elementData = newElementData; // make sure reference always elementData
            // Since newElementData is local variable, so it will release after calling function
            // so you don't need to worry newElementData occupy memory.

        }
        elementData[sizeWithElement++] = obj;
    }
    // rmByIndex()
    public void rmByIndex(int index) {
        // find index
        Object rmTarget = elementData[index];
        Object[] newElementData = new Object[sizeWithElement];
        // check if index at the beginning
        // system.arraycopy can be used for copy itself
        if (sizeWithElement-index-1>0) {
            System.arraycopy(elementData,index+1,elementData,index,sizeWithElement-index-1);
            elementData[--sizeWithElement] = null; // reduce size and remove last element
        } else if (sizeWithElement-index-1==0) {
            elementData[--sizeWithElement] = null;
        } else {
            System.out.println("Index "+ index + "out of bound" );
        }

    }
    // rmByValue()
    public void rmByValue(Object val) {
        for(int i=0;i<elementData.length;i++) {
            if(elementData[i].equals(val)) {
                this.rmByIndex(i);
            } else {
                System.out.println("value not found");
            }
        }

    }
    // get()
    public Object get(int index) {
        return elementData[index];
    }
    // getsize()
    public int getsize() {
        return sizeWithElement;
    }
    // set();
    public void set(int index, Object target) {
        if(indexCheck(index)) {
            elementData[index] = target;
        } else {
            System.out.println("Index out of bound");
        }
    }

    // range check
    public boolean indexCheck(int index) {
        if (index>sizeWithElement | index<0) {
            return false;
        }
        return true;
    }
    // indexOf()
    public int indexOf(Object val) {
        for(int i=0;i<elementData.length;i++) {
            if (elementData[i].equals(val)) {
                return i;
            }
        }
        return -1;

    }
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elementData,0,sizeWithElement));
    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(5);
        list.add(5);
        list.add("s");
        System.out.println(list.getsize());
        for(int i=0;i<list.getsize();i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf("s"));
        list.add("dhfkdshf");
        list.add(0.001f);
        list.set(3,"txt");
        System.out.println(list.toString());


        }

    }


// this part is implement arraylist based on list interface, too much method, i give up.
//public class MyArrayList extends List {
//    // to make you own implementing class based on list
//    // you can implement abstract method based on List interface
//    private Object[] elementData;
//    private int size;
//
//    public MyArrayList() {
//        // default make a 10 length array
//        // use this to invoke constructor
//        this(10);
//    }
//
//    public MyArrayList(int Capacity)  {
//        if (Capacity<0) {
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        elementData = new Object[Capacity];
//    }
//
//    public int size() {
//        return elementData.length;
//    }
//
//    public boolean isEmpty() {
//        return elementData.length==0;
//    }
//
//    public boolean contains(Object obj) {
//        for (int i = 0; i < elementData.length; i++) {
//
//            // remember reference type, use "==" means compare their memory address.
//            if (elementData[i].equals(obj)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
