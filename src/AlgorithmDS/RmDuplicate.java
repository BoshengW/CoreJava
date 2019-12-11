package AlgorithmDS;
import java.util.*;

public class RmDuplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4};
        System.out.println(Arrays.toString(rmDuplicate(array)));
    }

    public static int[] rmDuplicate(int[] array) {
        // two pointer algorithm
        if (array.length<=1) {
            return array;
        } else {
            int Pt1 = 0;
            int Pt2 = 1;
            int uqlength = 1;
            while (Pt2<array.length) {
                if (array[Pt1]!=array[Pt2]) {
                    array[++Pt1] = array[Pt2];
                    Pt1 = Pt2;
                    Pt2++;
                    uqlength++;
                } else {
                    Pt2++;
                }
            }
            return Arrays.copyOf(array,uqlength); //sublist
        }
    }
}
