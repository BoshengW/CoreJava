package AlgorithmDS;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] value = {3,1,6,2};
        System.out.println(Arrays.toString(value));
        Imprvsort(value);
        //sort(value);
        System.out.println(Arrays.toString(value));
    }

    private static void sort(int[] value) {
        int temp;
        for(int i=0; i<value.length; i++) {
            System.out.println("第"+i+"次");
            for(int j=0; j<value.length-i-1;j++) {

                if (value[j]>value[j+1]) {

                    temp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = temp;
                }
                System.out.println(Arrays.toString(value));
            }
        }
    }

    private static void Imprvsort(int[] value) {
        int temp;
        boolean sorted;
        for (int i=0; i<value.length; i++) {
            sorted = true;
            System.out.println("第"+i+"次");
            for (int j=0; j<value.length-i-1;j++) {
                if (value[j]>value[j+1]) {
                    temp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = temp;
                    sorted = false;
                }

            }
            System.out.println(Arrays.toString(value));
            if (sorted) {
                break; // break the loop
            }
        }
    }
}
