package day6;
public class InversionCount {
    public static int mergeAndCount(int[] src, int[] swap, int start, int mid, int end){
        int inversonCount=0;
        int leftIndex = start, rightIndex = mid+1, current = start;
        while(leftIndex<=mid&&rightIndex<=end){
            if(src[leftIndex]>=src[rightIndex]){
                swap[current]=src[rightIndex];
                rightIndex++;
                inversonCount += (mid-leftIndex+1);
            }
            else{
                swap[current]=src[leftIndex];
                leftIndex++;
            }
            current++;
        }

        while(leftIndex<=mid){
            swap[current]=src[leftIndex];
            leftIndex++;
        }
        while(rightIndex<=end){
            swap[current]=src[rightIndex];
            rightIndex++;
        }

        // replace sorted elements into orginal array
        for(int index = start; index<=end; index++){
            src[index] = swap[index];
        }

        return inversonCount;
    }
    public static int divide(int[] src,int[] swap, int start, int end){
        int inversion = 0;
        if(start<end){
            int mid = start+(end-start)/2;
            inversion += divide(src, swap, start, mid);
            inversion += divide(src, swap, mid+1, end);
            inversion += mergeAndCount(src, swap, start, mid, end);
        }
        return inversion;
    }
    public static void main(String[] args) {
        int[] arr = {30, 45, 25, 60, 20};
        int[] temp = new int[arr.length];
        System.out.println(divide(arr, temp, 0, arr.length-1));
    }
}
