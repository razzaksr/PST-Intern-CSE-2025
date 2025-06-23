package day4;

import java.util.Arrays;

public class SumRecursion {
    public static int findSum(int[] data, int current){
        // System.out.println(Arrays.toString(Arrays.copyOfRange(data, current, data.length)));
        if(current>=data.length)
            return 0;
        else
            return data[current]+findSum(data, current+1);
    }
    public static void main(String[] args) {
        int[] arr = {900,20,450,210,60};
        System.out.println(findSum(arr, 0));
    }
}
