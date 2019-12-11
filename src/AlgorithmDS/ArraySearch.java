package AlgorithmDS;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numarray = {1,2,5,6};
        int idx;
        //idx = search(numarray,5);
        idx = binarysearch(numarray,0,numarray.length-1,6);

    }
    // O(n) search, linear traversal
    public static int search(int[] array, int target) {
        for (int i=0; i<array.length; i++) {
            if (array[i]==target) {
                System.out.println("Target found: idx " +i);
                return i;
            }
        }
        System.out.println("target not found");
        return array.length+1;
    }
    // For sort array a faster way is binary search O(logN)
    public static int binarysearch(int[] array, int begin, int end, int target) {
        if (begin >= end) {
            if (array[begin] == target) {
                System.out.println("Target Found: idx " + begin);
                return begin;
            } else {
                System.out.println("Target not found.");
                return array.length + 1;
            }

        } else {
            int mid = (begin + end) / 2;
            if (array[mid] == target) {
                System.out.println(mid);
                return mid;
            } else if (array[mid] > target) {
                return binarysearch(array, begin, mid - 1, target);
            } else {
                return binarysearch(array, mid + 1, end, target);
            }

        }
    }

}
