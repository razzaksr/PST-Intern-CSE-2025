package day4;

public class FindMaxViaRecursion {
    public static int findMax(int[] arr, int current){
        if(current == arr.length-1)
            return arr[current];
        else{
            int currentMax = findMax(arr, current+1);
            return Math.max(arr[current], currentMax);
        }
    }
    public static void main(String[] args) {
        // int[] arr = {900,20,450,210,60};
        int[] arr = {0, 4, 5, 3, 7, 2, 1};
        System.out.println(findMax(arr, 0));
    }
}
