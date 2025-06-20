package day3;

public class Equilibrium {
    public static void main(String[] args) {
        // int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr = {0,-3,5,-4,-2,3,1,0};
        int totalSum = 0;
        for(int each:arr){totalSum+=each;}
        // System.out.println(totalSum);
        int partSum = 0;
        for(int index = 0;index<arr.length;index++){
            totalSum-=arr[index];
            if(totalSum==partSum){
                System.out.println(index);
                return;
            }
            else{
                partSum+=arr[index];
            }
        }
    }
}
