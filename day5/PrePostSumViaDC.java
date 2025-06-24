package day5;

import java.util.Arrays;

public class PrePostSumViaDC {
    public static void preSum(int[] arr,int[] pre,int index){
        if(index==0)
            pre[0]=arr[0];
        else{
            preSum(arr, pre, index-1);
            pre[index] = pre[index-1]+arr[index];
        }
    }
    public static void postSum(int[] arr,int[] post,int index){
        if(index==arr.length-1)
            post[arr.length-1]=arr[arr.length-1];
        else{
            postSum(arr, post, index+1);
            post[index] = post[index+1]+arr[index];
        }
    }
    public static void main(String[] args) {
        int[] nums = {23,12,98,45,18,45,12,98};
        int[] preSum = new int[nums.length];
        int[] postSum = new int[nums.length];
        preSum(nums,preSum,nums.length-1);
        System.out.println(Arrays.toString(preSum));
        postSum(nums,postSum,0);
        System.out.println(Arrays.toString(postSum));
    }
}
