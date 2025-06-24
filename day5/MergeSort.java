package day5;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        int lengthLeft=mid-start+1;
        int lengthRight=end-mid;

        int[] gotLeft=new int[lengthLeft];
        int[] gotRight=new int[lengthRight];

        for(int indexLeft=0;indexLeft<lengthLeft;indexLeft++){
            gotLeft[indexLeft]=arr[start+indexLeft];
        }

        for(int indexRight=0;indexRight<lengthRight;indexRight++){
            gotRight[indexRight]=arr[mid+1+indexRight];
        }

        // compare gotLeft and gotRight and store into original
        int indexLeft=0,indexRight=0,indexOrigin=start;

        while(indexLeft<lengthLeft&&indexRight<lengthRight){
            if(gotLeft[indexLeft]<gotRight[indexRight]){
                arr[indexOrigin]=gotRight[indexRight];
                indexRight++;
            }
            else{
                arr[indexOrigin]=gotLeft[indexLeft];
                indexLeft++;
            }
            indexOrigin++;
        }

        while(indexLeft<lengthLeft){
            arr[indexOrigin]=gotLeft[indexLeft];
            indexLeft++;
            indexOrigin++;
        }

        while(indexRight<lengthRight){
            arr[indexOrigin]=gotRight[indexRight];
            indexRight++;
            indexOrigin++;
        }
        
    }
    public static void sortByDivide(int[] arr, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, mid+1)));
            sortByDivide(arr, start, mid);
            // System.out.println(Arrays.toString(Arrays.copyOfRange(arr,mid+1 ,end+1)));
            sortByDivide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,48,31,25,40};
        sortByDivide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
