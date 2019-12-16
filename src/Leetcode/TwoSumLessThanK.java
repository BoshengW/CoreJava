package Leetcode;
import java.util.*;

public class TwoSumLessThanK {
    public int FindMaxTwoSum(int[] array, int target) {
        // Think about how to improve the algorithm
        // Brute force is O(n)
        // if you try to use only one pass
        //   try O(n) -> + binary-search -> O(logn)
        // if you want to use binary search you need to make sure array is sorted
        Arrays.sort(array);
        int maxSum = -1;
        int tempSum = -1;
        for (int i=0; i<array.length;i++) {
            int rest = target-array[i]-1;
            // java array binary search is good
            int idx = Arrays.binarySearch(array, rest);
            if (idx>=0 && i!=idx) {
                tempSum = array[idx]+array[i];

            } else if (idx<-1){
               int insertPt = -(idx+1)-1;
               if(insertPt!=i) {
                   tempSum = array[insertPt]+array[i];
               }
            }
            if (tempSum>maxSum) {
                maxSum = tempSum;
                if(idx<0) {
                    System.out.println("1. "+ array[-(idx+1)-1]+" 2. "+array[i]);
                }
                else {
                    System.out.println("1. "+ array[idx]+" 2. "+array[i]);

                }

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] list = {358,898,450,732,672,672,256,542,
                320,573,423,543,591,280,399,923,920,254,
                135,952,115,536,143,896,411,722,815,635,353,486,
                127,146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,777,185,549};
        int max;

        TwoSumLessThanK obj = new TwoSumLessThanK();
        max = obj.FindMaxTwoSum(list,1800);

    }

}
